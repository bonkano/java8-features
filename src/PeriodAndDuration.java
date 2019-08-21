import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PeriodAndDuration {

	public static void main(String[] args) {
		PeriodAndDuration tester = new PeriodAndDuration();
		tester.testDuration();
		tester.testPeriod();
	}

	private void testPeriod() {
		// Get the current date
		LocalDate date1 = LocalDate.now();
		System.out.println("Current date: " + date1);

		// add 1 month to the current date
		LocalDate date2 = date1.plus(1, ChronoUnit.MONTHS).plus(1, ChronoUnit.WEEKS);
		System.out.println("Next month: " + date2);

		Period period = Period.between(date2, date1);
		System.out.println("Period: " + period);
	}

	private void testDuration() {
		// Get the current time
		LocalTime time1 = LocalTime.now();
		System.out.println("Current time: " + time1);

		Duration twoHours = Duration.ofHours(2);
		System.out.println("Current duration: " + twoHours);

		LocalTime time2 = time1.plus(twoHours);
		Duration duration = Duration.between(time1, time2);
		
		System.out.println("Duration: " + duration);
	}

}
