
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FaultyWatch {

	public static String calculateActualTime(String correctTime, int secondsGain, int minutesEarly) {
		SimpleDateFormat sdf = new SimpleDateFormat("HHmm");
		Date date;
		try {
			// Parse correctTime to Date
			date = sdf.parse(correctTime);

			// Convert minutesEarly to seconds gained
			int totalSecondsGained = ((minutesEarly * 60) / 5) * secondsGain;

			// Add totalSecondsGained to the date
			date.setTime(date.getTime() + totalSecondsGained * 1000);

			// Format the result to HHmm
			return sdf.format(date);
		} catch (ParseException e) {
			e.printStackTrace();
			return null;
		}
	}

	public static void main(String[] args) {
		String correctTime = "1600";
		int secondsGain = 10;
		int minutesEarly = 10;

		String actualTime = calculateActualTime(correctTime, secondsGain, minutesEarly);
		System.out.println("X reached the venue at " + actualTime);
	}

}
