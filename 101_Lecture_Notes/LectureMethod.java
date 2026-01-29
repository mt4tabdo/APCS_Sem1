/* 
    Lecture note example - Methods
*/import java.util.Scanner;

class LectureMethod{
    public static void main(String args[]) {
      Scanner sc = new Scanner (System.in);
      System.out.println("Numba 1");
      int num1 = sc.nextInt();
      System.out.println("Numba 2");
      int num2 = sc.nextInt();
      
      
      
      add(num1, num2);
      
      int y = square(num2);
      System.out.println(y);
      System.out.println(square(num2));
     
     
     int z = abs(num1);
     System.out.println(z);
      
	}
	
	public static int abs(int value){
	    if(value < 0){
	     return value * (-1);
	        
	    }
	    else {
	        return value;
	    }
	}
	
	
	
	
	public static int square(int a){
	  int anw =  a * a;
	  return anw;
	  
	  
	}
	
	
	
	
	
	public static void add(int a, int b) {
	int sum = a + b;
	System.out.println(sum);
	return;
	
	
	}	
	
	
	
}