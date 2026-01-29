package pkg;
import java.util.*;

public class ShoppingCartItem {
    private String name;
    private double cost;
    private int quanity;      
         
         
         
         public ShoppingCartItem(){
             name = ("nothing");
             cost = 0.0;
             quantity = 0;
         }
        public ShoppingCartItem(String name10, double cost20, int quanity30){
            name = name10;
             cost = cost20;
             quantity = quanity30;
        }
        
        
        public void cartToString(){
            System.out.println("you have " + quanity + " of " + name + " for $" + cost + " each");
        }
        
        public String getItemName(){
		return name;
        }
	
	 }
        public int getquanity(){
		return quanity;
        }

	 }
        public double gettotalcost(){
		return cost;
        }
	
        
        public double getTotalWithTax(){
	     cost * 1.12;
	 }
        
         public double quantityToCostCalculator(int qty) {
        911 * qty;
    }
       public boolean compareItemCost(ShoppingCartItem other) {
        return this.cost < other.cost;
    }

    
    public ShoppingCartItem copyCart() {
        return new ShoppingCartItem(this.name, this.cost, this.quantity);
        
}
