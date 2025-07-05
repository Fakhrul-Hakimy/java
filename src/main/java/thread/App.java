package thread;



import java.util.Scanner;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class App extends RecursiveTask<Integer> {
    private String[] words;
    private int start;
    private int end;
    private String target;

    // Threshold to decide when to compute directly
    private static final int THRESHOLD = 10;

    public App(String[] words, int start, int end, String target) {
        this.words = words;
        this.start = start;
        this.end = end;
        this.target = target.toLowerCase();
    }

    @Override
    protected Integer compute() {
        if ((end - start) <= THRESHOLD) {
            // Base case: directly count
            int count = 0;
            for (int i = start; i < end; i++) {
                if (words[i].equalsIgnoreCase(target)) {
                    count++;
                }
            }
            return count;
        } else {
            // Recursive case: split task
            int mid = (start + end) / 2;
            App leftTask = new App(words, start, mid, target);
            App rightTask = new App(words, mid, end, target);

            leftTask.fork(); // Run left in separate thread
            int rightResult = rightTask.compute(); // Run right in current thread
            int leftResult = leftTask.join(); // Wait for left thread

            return leftResult + rightResult;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input one word to count: ");
        String word = scanner.nextLine().toLowerCase();

        String sentence = "I started this business — originally called Bryson Limited in the UK — in 1992 as the perfect marriage of my day job (software development) and my hobby (cryptic crosswords). Twenty-seven years later, it’s time to wrap it up. I thank all my loyal customers, and any new people looking for TEA Crossword Helper, Sympathy Crossword Construction, and Crossword Wordplay Wizard. I have enjoyed your support over the years and from around the world. All Crossword Man / Bryson Limited products have now been withdrawn from sale. If you have existing versions of TEA and/or Sympathy, please know that while I appreciate your attachment to my software, products of their vintage might be impacted at any time by advances made by Microsoft or other third-party components. I won’t be able to change that.";

        // Split sentence into words
        String[] words = sentence.toLowerCase().split("\\W+");

        ForkJoinPool pool = new ForkJoinPool();
        App task = new App(words, 0, words.length, word);

        int total = pool.invoke(task);
        System.out.println("The word \"" + word + "\" appears " + total + " times.");
    }
}

