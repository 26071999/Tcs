import java.util.Scanner;

public class Encryt {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String encrypt="";
        for(int i =0;i<s.length();i++) {
            char c= (char) ('a'-s.charAt(i)+'z');
            encrypt+=c;
        }
        System.out.println(encrypt);
    }
}
