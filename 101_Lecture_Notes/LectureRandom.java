/*
    Lecture note example - Random!!
*/

class LectureRandom{
    public static void main(String args[]) {
        // Your Code Goes here!
        
        double num1 = (double) (Math.random() * 5);
        
        System.out.println(num1);
        
        
        double num2 = (double) (Math.random() * 20 + 15);
        
           System.out.println(num2);
        
        
        double num3 = (double) (Math.random() * 6767 + 1024);
        
           System.out.println(num3);
        
        
        int num4 = (int)(Math.random() *42 + (-13) );
		
		System.out.println(num4);
		
		int num5 = (int)(Math.random() * 55 + 30 );
		
		
		int num6 = (int)(Math.random() * 80 + 105);
		
		int anw = (int)(Math.random() * (num5-num6) + num5);
		
		
		System.out.println(anw)
		
		
		
	}
}
