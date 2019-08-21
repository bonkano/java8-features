import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjustersExample {

	public static void main(String[] args) {
		TemporalAdjustersExample tester = new TemporalAdjustersExample();
		tester.testAdjusters();
	}

	private void testAdjusters() {
		// Get the current date
		LocalDate date1 = LocalDate.now();
		System.out.println("Current date: " + date1);

		// Get the next
		LocalDate nextTuesday = date1.with(DayOfWeek.TUESDAY);
		System.out.println("Next Tuesday on: " + nextTuesday);

		// Get the second Saturday of next week
		LocalDate firstInYear = LocalDate.of(date1.getYear(), date1.getMonth(), 1);
		LocalDate seconfSaturday = firstInYear.with(TemporalAdjusters.nextOrSame(DayOfWeek.SATURDAY))
				.with(TemporalAdjusters.next(DayOfWeek.SATURDAY));
		System.out.println("Second Saturday on: " + seconfSaturday);

	}

}
