package basic;

import java.util.Scanner;

public class array {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.print("Please enter number of fruits :");
        int count=scanner.nextInt();
        scanner.nextLine();
        String [] fruits= new String[count];


        System.out.println("Please enter "+fruits.length+" fruit");
        for(int i=0;i< fruits.length;i++){
            System.out.print("Please enter fruit : ");
            fruits[i]=scanner.nextLine();
        }

        // this is enchance for
        for (String fruit : fruits) {
            System.out.println(fruit);

        }
        System.out.println("Total of fruit : "+fruits.length);
    }
}
