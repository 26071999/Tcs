import java.util.Arrays;
import java.util.Scanner;

public class Painting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int interior=sc.nextInt();
        int exterior=sc.nextInt();
        double interiorSurfaceAreas[]=new double[interior];
        double exteriorSurfaceAreas[]=new double[exterior];
        if(interior<=0||exterior<=0){
            System.out.println("INVALID INPUT");
            System.exit(0);
        }
        for(int i=0;i<interior;i++)
            interiorSurfaceAreas[i]=sc.nextDouble();
        for(int j=0;j<exterior;j++)
            exteriorSurfaceAreas[j]=sc.nextDouble();
        double rate1=0;
        double rate2=0;
       rate1= Arrays.stream(interiorSurfaceAreas).map(i->i).sum();
       rate2=Arrays.stream(exteriorSurfaceAreas).map(j->j).sum();
        double totalRate=(rate1*18)+(rate2*12);
        System.out.println("Total Estimated Cost :"+totalRate);
    }
}
