import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ChronoUnitsEnum {

	public static void main(String[] args) {
		ChronoUnitsEnum tester = new ChronoUnitsEnum();
		tester.testChronoUnitEnum();

	}

	private void testChronoUnitEnum() {
		// Get current date
		LocalDate today = LocalDate.now();
		System.out.println("Current date: " + today);

		// add 1 week to the current date
		LocalDate nextWeek = today.plus(1, ChronoUnit.WEEKS);
		System.out.println("Next week: " + nextWeek);

		// add 1 month to the current date
		LocalDate nextMonth = today.plus(1, ChronoUnit.MONTHS);
		System.out.println("Next week: " + nextMonth);

		// add 1 year to the current date
		LocalDate nextYear = today.plus(1, ChronoUnit.YEARS);
		System.out.println("Next week: " + nextYear);

		// add 1 year to the current date
		LocalDate nextDecade = today.plus(1, ChronoUnit.DECADES);
		System.out.println("Next week: " + nextDecade);
	}

}
