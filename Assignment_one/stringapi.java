package Assignment_one;

import java.util.Scanner;

public class stringapi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a string: ");
		String input = scan.nextLine();
		System.out.println("enter a char: ");
		char target = scan.next().charAt(0);
		//System.out.println("character "+"'"+input. +"'");
		int count = 0;
		for(int i=0;i<input.length();i++) {
			if (input.charAt(i) == target) {
				count++;
			}
		}
	System.out.println("Character '" + target + "' appears " + count + " times.");
	scan.close();
	}

}
