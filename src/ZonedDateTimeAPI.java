import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeAPI {
	public static void main(String[] args) {
		ZonedDateTimeAPI tester = new ZonedDateTimeAPI();
		tester.testZonedDateTime();
	}

	private void testZonedDateTime() {
		// Get the current date and time
		ZonedDateTime date1 = ZonedDateTime.now();
		System.out.println("Date1: " + date1);

		ZoneId zoneId = ZoneId.of("Europe/Paris");
		System.out.println("ZoneId: " + zoneId);

		ZoneId currentZone = ZoneId.systemDefault();
		System.out.println("Current Zone ID: " + currentZone);
	}
}
