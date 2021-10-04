import com.sun.xml.internal.stream.Entity;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BusRoute {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String source = sc.nextLine().toUpperCase();
        String destination = sc.nextLine().toUpperCase();
        if (source.equals(destination)) {
            System.out.println("INVALID OUTPUT");
            System.exit(0);
        }


        getFair(source,destination);

    }

    private static void getFair(String source, String destination) {
        Integer path[]={800,600,750,900,1400,1200,1100,1500};
        String busStops[]={"TH","GA","IC", "HA", "TE", "LU", "NI","CA" };
        int distance=0;

        start:
        for(int i=0;i<busStops.length;i++) {
           for (int j = busStops.length-1; j >=0; j--) {
               if (source.equals(busStops[i]) ) {
                   if (destination.equals(busStops[j])) {
                       for (int k = i; k >= j; k++) {
                           distance += path[k];
                       }
                   }
               }
                   else {
                       continue start;
                   }
           }
       }
       double cost=(distance/1000)*5;
        System.out.println(cost+" INR");
    }
}
