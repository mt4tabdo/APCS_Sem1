/*
    Lecture note example - Input!!
*/
import java.util.Scanner;

class LectureInput{
    public static void main(String args[]) {
        // Your Code Goes here!
        Scanner sc = new Scanner(System.in);
        double item1price = 10.25;
        double item2price = 9.21;
        double item3price = 8.75;
        
        System.out.println("🥞 Welcome to Mini Pekka's Pancake House 🥞");
        System.out.println("Here's the menu:");
        System.out.println("1.🥞🍌🍨 Neoapolitan Banana Pancake- $ + item1price ");
        System.out.println("2.🫐🥞 Blueberry Pancakes- $ +item2price ");
        System.out.println("3.🥞🧈🥛 Buttermilk Pancakes- $ + item3price");
        
        
        System.out.println("What's the name for your order?");
        
        String name = sc.nextLine();
        System.out.println("how many Neoapolitan Banana Pancakes would you like");
        int quantity1 = sc.nextInt();
        
        System.out.println("how many Blueberry Pancakes would you like");
        int quantity2 = sc.nextInt();
        
         System.out.println("how many Buttermilk Pancakes would you like");
        int quantity3 = sc.nextInt();
        
        double total1 = item1price + quantity1;
        
        double total2 = item2price + quantity2;
        
        double total3 = item3price + quantity3;
        
        double total = total1+ total2+ total3;
        
        System.out.println();
        System.out.print("Your current total is $" + total);
        System.out.println(" What percent would you like to tip?");
        double tipPercent = sc.nextDouble();
        double tip = total * (tipPercent/100);
        double grandTotal = tip + total;
        
        System.out.println(name +" Reciept:");
        
        System.out.println(quantity1 +"x Neoapolitan Banana Pancakes = $" + total);
         System.out.println(quantity2 + "x Blueberry Pancakes = $"+ total2);
          System.out.println(quantity3 + "x Buttermilk Pancakes = $" + total3);
           System.out.println("Tip" + tipPercent + "= $" + tip);
           
           System.out.println("= $" + grandTotal);
        
        
        
        
	}
}
