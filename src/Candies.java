import java.util.Scanner;

public class Candies {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=10;
        int k=5;
            int input=sc.nextInt();
            if(input>=1&&input<=k){
                int remaining=N-input;
                    System.out.println("NUMBER OF CANDIES SOLD :"+input);
                    System.out.println("NUMBER OF CANDIES AVAILABLE :"+ remaining);
                 System.out.println("Hello everyone");

            }
            else {
                System.out.println("INVALID INPUT");
                System.out.println("NUMBER OF CANDIES LEFT :"+N);
                 System.out.println("Hi Hello");
                 System.out.println("I am Prakash");
        }
    }
}
