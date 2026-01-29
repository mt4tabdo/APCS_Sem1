/*
 *	Author:
 *  Date:
 * 	Collaborator(s):
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Employee michael = new Employee();
		michael.employeeToString();
		
		Employee d = new Employee(1987, "Dwight", "Strute", 4416.66);
		d.employeeToString();
		double Dwight = d.getAnnualSalary();		
		System.out.println("Annual Salary: " + Dwight);
		d.raiseSalary(50);
		System.out.println("New Annual Salary: " + d.getAnnualSalary());
		
		

			Employee j = new Employee(2474, "Jim", "Halpret", 4416.66);
		j.employeeToString();
		double Jim = j.getAnnualSalary();		
		System.out.println("Annual Salary: " + Jim);
			j.raiseSalary(50);
		System.out.println("New Annual Salary: " + j.getAnnualSalary());
		
			Employee p = new Employee(2011, "Pam", "Beesly", 2250);
		p.employeeToString();
		 double pam = p.getAnnualSalary();		
		System.out.println("Annual Salary: " + pam);
			p.raiseSalary(50);
		System.out.println("New Annual Salary: " + p.getAnnualSalary());
		
		
		Employee l = new Employee(6767, "Lebron", "James", 2250);
		l.employeeToString();
		double Lebron = l.getAnnualSalary();		
		System.out.println("Annual Salary: " + Lebron);
			l.raiseSalary(50);
		System.out.println("New Annual Salary: " + l.getAnnualSalary());
	}
}
 
			
