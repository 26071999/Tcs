import java.util.Arrays;
import java.util.Scanner;

public class FindMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int E[] = new int[t];
        int L[] = new int[t];
        for (int i = 0; i < t; i++)
            E[i] = sc.nextInt();
        for (int i = 0; i < t; i++) {
            L[i] = sc.nextInt();
        }
        int max=0;
        int count=0;

        for (int i = 0; i < t; i++) {
                    max =max+ E[i] - L[i];
                    if(max>count){
                        count=max;
                }
            }
        System.out.println(count);


        }
}