/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc =  new Scanner(System.in);
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		
// a. Max(13 - 6 * 11, 30 % 7 * (-2))
        int a1 = 13 - 6 * 11;         // 13 - 66 = -53
        int a2 = (30 % 7) * (-2);     // (30 % 7 = 2) * (-2) = -4
        int resultA = Math.max(a1, a2);
        System.out.println("a. " + resultA);
        // b. Sqrt(3 * 8 + 31 % 7)
        int b1 = 3 * 8 + (31 % 7);    // 24 + 3 = 27
        double resultB = Math.sqrt(b1);
        System.out.println("b. " + resultB);
        // c. Pow(37 / 3, 35 % 21)
        int c1 = 37 / 3;              // 12
        int c2 = 35 % 21;             // 14
        double resultC = Math.pow(c1, c2);
        System.out.println("c. " + resultC);
        // d. Max(Pow(2, 14 % 3), Sqrt(2 * 6))
        double d1 = Math.pow(2, 14 % 3);    // 2 ^ (14 % 3 = 2) = 4
        double d2 = Math.sqrt(2 * 6);       // sqrt(12) ≈ 3.464
        double resultD = Math.max(d1, d2);
        System.out.println("d. " + resultD);

	}
}
