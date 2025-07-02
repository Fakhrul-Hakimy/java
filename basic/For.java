package basic;
import java.util.Scanner;
public class For {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter number of loop : ");
        int loop=scanner.nextInt();

        for(int i=0; i<loop;i++){
            System.out.println("This is Loop number "+(i+1));
        }
    }

}
