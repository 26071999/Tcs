import java.util.Scanner;

public class EncryptString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter your plain text :");
        String text=sc.nextLine();
        System.out.println("Enter the key :");
        int key=sc.nextInt();
        CustomeCaesarCipher(key,text);
    }

    private static void CustomeCaesarCipher(int key,String message) {
        String []s=message.split(" ");

        String encryptString="";

        for(String s1:s) {
            String encrypt="";
            for (int i = 0; i < s1.length(); i++) {
                char c = (char) (s1. charAt(i)+key);
                encrypt=encrypt+c;

            }
            encryptString+=encrypt+" ";
        }
        System.out.println("The encrypted test is :"+encryptString);

    }
}
