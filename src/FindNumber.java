import java.util.Arrays;
import java.util.Scanner;

public class FindNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int []numberList=new int[6];
        for(int i=0;i<6;i++){
            numberList[i]=sc.nextInt();
        }
        int baseLine=sc.nextInt();
        func(numberList,baseLine);
    }

    private static void func(int[] numberList, int baseLine) {
        long count1= Arrays.stream(numberList).filter(i->i>baseLine).count();
        long count2=Arrays.stream(numberList).filter(i->i<baseLine).count();
        System.out.println("Below baseLine: "+count2);
        System.out.println("Above baseLine :"+count1);
    }
}
