import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Doctor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> ages = new ArrayList<>();
        int i = 0;

      start:
      while (i <= 20) {
/*
           if(!ages.add(sc.hasNextInt())){
                break start;
            }*/
            if (ages.get(i) <= 0 && ages.get(i) > 120) {
                break;
            }
            i++;
        }
        int income=0;
        for (int j = 0; j < ages.size() - 1; j++) {

            if (ages.get(j)<17){
                income+=200;

            }
            else if(ages.get(i)>=17&&ages.get(i)<=40){
                income+=400;

            }
            else if(ages.get(i)>40){
                income+=300;
            }

        }
        System.out.println("Total income :"+income+"INR");
    }
}
