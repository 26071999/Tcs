import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class VendingMachine {

    public static void main(String[] args) {

       Map<Integer,String> subCoffeeItem=new HashMap<>();

           subCoffeeItem.put(1,"Espresso Coffee");
        subCoffeeItem.put(2,"Cappucino Coffee");
        subCoffeeItem.put(3,"Latte Coffee");
        Map<Integer,String>subTeaItems=new HashMap<>();
        subTeaItems.put(1,"Plain Tea");
        subTeaItems.put(2,"Assam Tea");
        subTeaItems.put(3,"Ginger Tea");
        subTeaItems.put(4,"Caradomom Tea");
        subTeaItems.put(5,"Masala Tea");
        subTeaItems.put(6,"Lemon Tea");
        subTeaItems.put(7,"Green Tea");
        subTeaItems.put(8,"Organic Darjeeling Tea");

        Map<Integer,String>subSoupItems=new HashMap<>();
        subSoupItems.put(1,"Hot and Sour Soup");
        subSoupItems.put(2,"Veg Corn Soup");
        subSoupItems.put(3,"Tomota Soup");
        subSoupItems.put(4,"Spicy Tomota Soup");

        Map<Integer,String>subBeverageItems=new HashMap<>();
        subBeverageItems.put(1,"Hot Chocolate Drink");
        subBeverageItems.put(2,"Badam Drink");
        subBeverageItems.put(3,"Badam-Pista Drink");

        displayItems(subCoffeeItem,subBeverageItems,subSoupItems,subTeaItems);


    }

    private static void displayItems(Map<Integer, String> subCoffeeItem, Map<Integer, String> subBeverageItems, Map<Integer, String> subSoupItems, Map<Integer, String> subTeaItems) {
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine().toUpperCase();
        int subMenu=sc.nextInt();
        switch (input){
            case "C":
                if(subMenu<=subCoffeeItem.size()) {
                    System.out.println("WelCome to CCD!");
                    System.out.println("Enjoy your "+subCoffeeItem.get(subMenu)+"!");

                }
                else {
                    System.out.println("INVALID INPUT!");

                }
                break;
            case "T":
                if(subMenu<=subTeaItems.size()) {
                    System.out.println("WelCome to CCD!");
                    System.out.println("Enjoy your "+subTeaItems.get(subMenu)+"!");
                }
                else {
                    System.out.println("INVALID INPUT!");
                }
                break;
            case "S":
                if(subMenu<=subSoupItems.size()) {
                    System.out.println("WelCome to CCD!");
                    System.out.println("Enjoy your "+subSoupItems.get(subMenu)+"!");
                }
                else {
                    System.out.println("INVALID INPUT!");
                }
                break;
            case "B":
                if(subMenu<=subBeverageItems.size()) {
                    System.out.println("WelCome to CCD!");
                    System.out.println("Enjoy your "+subBeverageItems.get(subMenu)+"!");
                }
                else {
                    System.out.println("INVALID INPUT!");
                }
                break;
            default:
                System.out.println("INVALID INPUT!");
                break;
        }


    }
}
