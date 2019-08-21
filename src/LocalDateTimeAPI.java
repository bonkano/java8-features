import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeAPI {
	public static void main(String[] args) {
		LocalDateTimeAPI tester = new LocalDateTimeAPI();
		tester.testLocalDateTime();
	}

	public void testLocalDateTime() {
		// Get the current date and time
		LocalDateTime currentTime = LocalDateTime.now();
		System.out.println("Current DateTime: " + currentTime);

		LocalDate date1 = currentTime.toLocalDate();
		System.out.println("Date1: " + date1);

		Month month = currentTime.getMonth();
		int day = currentTime.getDayOfMonth();
		int seconds = currentTime.getSecond();

		System.out.println("Month: " + month + " Day: " + day + " Seconds: " + seconds);

		LocalDateTime date2 = currentTime.withDayOfMonth(10).withYear(2012);
		System.out.println("Date2: " + date2);

		// 12 december 2014
		LocalDate date3 = LocalDate.of(2014, Month.DECEMBER, 12);
		System.out.println("Date3: " + date3);

		LocalTime date4 = LocalTime.of(22, 15);
		System.out.println("Date4: " + date4);

		// parse a string
		LocalTime date5 = LocalTime.parse("21:15:30");
		System.out.println("Date5: " + date5);
	}
}
