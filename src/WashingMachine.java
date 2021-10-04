import java.util.Scanner;

public class WashingMachine {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n==0){
            System.out.println("Estimated time is 0");
        }
        else if(n>0&&n<=2000){
            System.out.println("Time Estimated :"+25);
        }
        else if(n>=2001&&n<4000){
            System.out.println("Time estimated :"+35);
        }
        else if(n>4000&&n<=7000){
            System.out.println("Time Estimated :"+45);
        }
        else {
            System.out.println("INVALID INPUT");
        }
    }
}
