package Assignment_one;
import java.time.DayOfWeek;
import java.time.LocalDate;
public class Enumday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DayOfWeek currentDay = LocalDate.now().getDayOfWeek();
		enum_day today = enum_day.valueOf(currentDay.name());
		
	switch(today) {
		case SUNDAY:
			System.out.println("Finally, it's Sunday Funday!");
            break;
		case MONDAY:
			System.out.println("Start of the work week!");
            break;
		case TUESDAY:
			System.out.println("This day is too long!");
            break;
		case WEDNESDAY:
			System.out.println("We are at the middle of week!");
            break;
		case THURSDAY:
			System.out.println("ITS THURRRSSSDAYYYYYY!");
            break;
		case FRIDAY:
			System.out.println("Friday! Almost there for the weekend!");
            break;
		case SATURDAY:
			System.out.println("Weekend is here!!! ");
            break;
		}
	}
}
