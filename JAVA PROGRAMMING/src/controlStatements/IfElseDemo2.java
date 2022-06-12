package controlStatements;

import java.util.Scanner;

public class IfElseDemo2 {

	public static void main(String[] args) {
		// IfElse Example 2
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		if (age>=18) {
			System.out.println("Eligible to vote");
		}
		else {
		    System.out.println("Not eligible to vote still minor");			
		}

	}

}
