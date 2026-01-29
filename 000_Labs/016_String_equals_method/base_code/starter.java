
import java.util.Scanner;


class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);

        System.out.println("Choose your role: Wizard, Warrior, or Rogue");
        String imput = sc.nextLine();
        
        boolean a = imput.equals("Wizard");
        boolean b = imput.equals("wizard");
        
        boolean c = imput.equals("Warrior");
        boolean d = imput.equals("warrior");
        
        boolean f = imput.equals("rogue");
        boolean g = imput.equals("Rogue");
        

       if(a || b){ 
       	System.out.println("you choose Wizard");
       }
       else if (c || d){ 
       	System.out.println("you choose Warrior");
       }
       else if (f || g){
       	System.out.println("you choose Rogue");
       }
       else { 
       	System.out.println("Invalid, please choose one of the following");
       }
       
       

	}
}
