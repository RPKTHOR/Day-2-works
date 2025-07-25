package StringProgram;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class task3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// concat
		System.out.println("enter the first name");
		String one = scan.nextLine();
		System.out.println("enter the last name");
		String two = scan.nextLine();
		System.out.println("welcome "+ one.concat(two)+" !!");
		
		StringBuilder sb = new StringBuilder(one);
		sb.reverse();
		System.out.println("reversed string: "+sb);
		
		//email
		System.out.println("Enter your mail: ");
		String mail = scan.nextLine();
		
		if (mail.contains("@") && mail.endsWith(".com"))
			System.out.println("valid email");
		else {
			System.out.println("Invalid email");
		}
		
		//date and time
		LocalDate date = LocalDate.now();
		LocalTime time = LocalTime.now();
		LocalDateTime datetime = LocalDateTime.now();
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String formattedDateTime = datetime.format(formatter);
		System.out.println("Formatted Date and Time: "+formattedDateTime);
		
		// numeric object
		System.out.println("Enter a subject score: ");
		String sub1 = scan.nextLine();
		System.out.println("enter another subject score: ");
		String sub2 = scan.nextLine();
		int num2 = Integer.parseInt(sub1);
		int num1 = Integer.parseInt(sub2);
		System.out.println();
	System.out.println("Max(x,y): "+Math.max(num1, num2));
	System.out.println("Average: "+ (num1+num2)/2);
	
	scan.close();	
	}
}