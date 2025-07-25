package javaprograms;

import java.util.Scanner;

public class vote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner n = new Scanner(System.in);
		System.out.println("Enter your age: ");
		int vote = n.nextInt();
		if(vote>18) {
			System.out.println("you are eligible to vote");
		}
		else if (vote < 18)
			System.out.println("not eligible to vote");
		n.close();
	}

}
