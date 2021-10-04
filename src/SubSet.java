import java.util.Arrays;
import java.util.Scanner;

public class SubSet {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int arr[]=new int[num];
        for(int i=0;i<num;i++)
            arr[i]=sc.nextInt();
        int num2=sc.nextInt();
        int S= sc.nextInt();
        boolean flag=false;
        for(int i=0;i<num;i+=S){
            flag=false;
            for(int j=i;j<i+S&&j<num;j++){
                if(arr[i]==num2)
                    flag=true;
            }
            if(flag)
                continue;
            else {
                System.out.println(0);
                System.exit(0);
            }

        }
        System.out.println(1);
    }
}
