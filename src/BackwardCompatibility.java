import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

public class BackwardCompatibility {

	public static void main(String[] args) {
		BackwardCompatibility tester = new BackwardCompatibility();
		tester.testBackwardCompatibility();
	}

	private void testBackwardCompatibility() {
		// Get the current date
		Date currentDate = new Date();
		System.out.println("Current date: " + currentDate);

		// Get the instant of the current day in terms of milliseconds
		Instant now = currentDate.toInstant();
		ZoneId currentZone = ZoneId.systemDefault();

		LocalDateTime localDateTime = LocalDateTime.ofInstant(now, currentZone);
		System.out.println("Local date: " + localDateTime);

		ZonedDateTime zonedDateTime = ZonedDateTime.ofInstant(now, currentZone);
		System.out.println("Zoned date: " + zonedDateTime);
	}

}
