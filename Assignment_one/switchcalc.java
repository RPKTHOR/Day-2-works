package Assignment_one;

import java.util.Scanner;
public class switchcalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter first number: ");
		double num1 = scan.nextDouble();
		System.out.print("Enter second number: ");
		double num2 = scan.nextDouble();
		System.out.print("Enter operation (+, -, *, /): ");
		char opers = scan.next().charAt(0);
		
		double result = 0;
		boolean valid = true;
		switch (opers) {
		case '+':
			result = num1+num2;
			break;
		case '-':
			result = num1-num2;
			break;
		case '*':
			result = num1*num2;
			break;
		case '/':
			result = num1/num2;
			break;
		default:
			System.out.println("invalid operation entered");
			valid = false;
		}if (valid) {
			System.out.println("result: "+result);	
		}
		scan.close();
	}
}