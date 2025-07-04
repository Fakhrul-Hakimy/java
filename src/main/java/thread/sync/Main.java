package thread.sync;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Non sync");
        System.out.println("2. Sync");
        System.out.print("Choose which to run : ");
        int choice=scanner.nextInt();

        switch(choice){
            case 1:
                System.out.println("Non Sync");
                NonSync thread1 = new NonSync();
                NonSync thread2 = new NonSync();
                thread1.start();
                thread2.start();
                break;
            case 2:
                System.out.println("Sync");
                Sync thread3 = new Sync();
                Sync thread4 = new Sync();
                thread3.start();

                thread4.start();
                break;
        }



    }
}
