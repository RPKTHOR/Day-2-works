package Assignment_one;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class dtno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate date = LocalDate.now();		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		String formattedDate = date.format(formatter);
		System.out.println("Current Date: "+formattedDate);		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the amount");
		Locale india = new Locale("en", "IN"); //getCurrencyInstance(("en-IN"));
		double amount = scan.nextDouble();
		NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(india);
		String formattedAmount = currencyFormatter.format(amount);
				
		System.out.println(formattedAmount);
			scan.close();
	}
}
