package thread.tuto4Runnable;

import java.util.Scanner;
public class MyRunnnable {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number start : ");
        int x=scanner.nextInt();
        System.out.print("Enter number end : ");
        int y=scanner.nextInt();
        Odd oddrunnable= new Odd(x,y);
        Even evenrunnable= new Even(x,y);
        Thread thread1 = new Thread(oddrunnable);
        Thread thread2 = new Thread(evenrunnable);
        thread1.start();
        thread2.start();






    }
}
