package operators;
import java.util.Scanner;
public class SwitchSample {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("wlcome to abc bank");
		System.out.println("1. check balance");
		System.out.println("2. deposit money");
		System.out.println("3. withdraw money");
		System.out.println("4. exit");
		
		int bal = 0;
		int ch;
		do  {
		System.out.println("enter your choice");
		ch = s.nextInt();
		switch(ch) {
			case 1:
				System.out.println("your balance is "+bal);
				break;
			case 2:
				System.out.println("enter amount to deposit ");
				int dep = s.nextInt();
				bal = bal+dep;
				System.out.println("dep success");
				break;
			case 3:
				System.out.println("enter amount to withdraw");
				int draw = s.nextInt();
				bal = bal-draw;
				System.out.println("withdraw sucess");
				break;
			case 4:
				System.out.println("thank you for using abc bank");
				break;
		}
	} while(ch != 4); s.close();
}
}