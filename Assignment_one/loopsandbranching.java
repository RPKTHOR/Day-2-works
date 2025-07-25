package Assignment_one;
import java.util.Scanner;

public class loopsandbranching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value: ");
		int N = scan.nextInt();
		System.out.println("First "+ N+ " even numbers");
		for(int i=0;i<N; i++) {
			System.out.println(i*2);
		}
		scan.close();
	}
}