package Assignment_one;

import java.util.Scanner;
public class Array_average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int[] numbers = new int[5];
		int sum = 0;
		
		System.out.println("Enter only 5 numbers: ");
		for(int i=0;i<numbers.length;i++) {
			numbers[i] = scan.nextInt();
			sum+=numbers[i];
		}
		double avg = (double)sum/numbers.length;
		System.out.println(avg + " is the average!");
		scan.close();
	}
}