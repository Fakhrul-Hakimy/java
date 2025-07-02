package basic;

public class breakcontinue {

    public static void main(String[] args) {
        //break will stop the loop entirely
        //continue skip the current loop go to next loop

        for(int i=0;i<10;i++){

            if(i==7){
                break; //will stop the loop when it reach 7
            }else{
                System.out.println(i);
                continue;
                //System.out.println("This will not be print");
                //ide detect it as unreachable because it after continue statement
            }
        }
    }
}
