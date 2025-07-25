package Assignment_one;

import java.util.Scanner;

public class stringbuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a string: ");
			String input = scan.nextLine();
		StringBuilder sb = new StringBuilder(input);
		System.out.println("original string: "+ sb);
		sb.reverse();
		System.out.println("reversed string: "+ sb);
	scan.close();
	}

}
