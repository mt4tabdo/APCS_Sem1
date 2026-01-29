/*
 *	Author:
 *  Date:
*/

import java.util.Scanner;

class starter {
	public static boolean checkPrime(int number) {
        int divisor = 2;
        while (divisor < number) {
            if (number % divisor == 0) {
                return false;
            }
            divisor++;
        }
        return true;
    }

    public static void printPrimes(int maxNumber) {
        int current = 2;
        while (current < maxNumber) {
            if (checkPrime(current)) {
                System.out.println(current);
            }
            current++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a number and we'll print out every prime until that number: ");
        int userInput = sc.nextInt();

        printPrimes(userInput + 1);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
