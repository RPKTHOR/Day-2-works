package Assignment_one;

import java.util.Scanner;
public class flowcontrol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter a number ");
		int num = s.nextInt();
		if(num>0) {
			System.out.println("number is positive");
		}
		else if (num<0)
			System.out.println("number is negative");
		else
			System.out.println("zero");
		s.close();
	}
}