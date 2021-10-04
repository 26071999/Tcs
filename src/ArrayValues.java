import java.util.Scanner;

public class ArrayValues {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        int count=0;
        for(int i=0;i<size;i++){
            arr[i]= sc.nextInt();
        }
        for(int i=0;i<size-1;i++){
            if(i==0) {
                count++;
            }
             if(arr[i]<arr[i+1]){
                count++;
            }
        }
        System.out.println(count);
    }
}
