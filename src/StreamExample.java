import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class StreamExample {
	public static void main(String[] args) {
		System.out.println("Using Java 7: ");

		// count empty strings
		List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
		System.out.println("List: " + strings);
		long count = getCountEmptyStringUsingJava7(strings);

		System.out.println("Empty Strings: " + count);
		count = getCountLenght3UsingJava7(strings);

		System.out.println("Stringd of lenght 3: " + count);

		// Eliminate empty string
		List<String> filteredList = deleteEmptyStringsUsingJava7(strings);
		System.out.println("Filtered List: " + filteredList);

		// Eliminate empty string and join using comma .
		String mergedString = getMergedStringUsingJava7(strings, ", ");
		System.out.println("Merged String: " + mergedString);
		List<Integer> numbers = Arrays.asList(3, 2, 2, 7, 3, 5);

		// get list of square of distinc numbers
		List<Integer> squareList = getSquares(numbers);
		System.out.println("Square List: " + squareList);
		List<Integer> integers = Arrays.asList(1, 2, 13, 4, 15, 6, 17, 8, 19);

		System.out.println("List: " + integers);
		System.out.println("Highest number in List: " + getMax(integers));
		System.out.println("Lowest  number in List: " + getMin(integers));
		System.out.println("Sum of all numbers: " + getSum(integers));
		System.out.println("Average of all numbers: " + getAverage(integers));
		System.out.println("Random Numbers: ");

		// print 10 random numbers
		Random random = new Random();
		for (int i = 0; i < 10; i++) {
			System.out.println(random.nextInt());
		}

		System.out.println("Using Java 8: ");
		System.out.println("List: " + strings);

		count = strings.stream().filter(string -> string.isEmpty()).count();
		System.out.println("Empty Strings: " + count);

		count = strings.stream().filter(string -> string.length() == 3).count();
		System.out.println("Strings of lenght 3: " + count);

		filteredList = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
		System.out.println("Filtered List: " + filteredList);

		mergedString = strings.stream().filter(s -> !s.isEmpty()).collect(Collectors.joining(", "));
		System.out.println("Merged String: " + mergedString);

		squareList = numbers.stream().map(i -> (int) Math.pow(i, 2)).distinct().sorted().collect(Collectors.toList());
		System.out.println("Squared List: " + squareList);
		System.out.println("List: " + integers);

		IntSummaryStatistics stats = integers.stream().mapToInt(x -> x).summaryStatistics();

		System.out.println("Highest number in List: " + stats.getMax());
		System.out.println("Lowest  number in List: " + stats.getMin());
		System.out.println("Sum of all numbers: " + stats.getSum());
		System.out.println("Average of all numbers: " + stats.getAverage());

		random.ints().limit(10).sorted().forEach(System.out::println);

		// parallel processing
		count = strings.parallelStream().filter(s -> s.isEmpty()).count();
		System.out.println("Empty Strings: " + count);
	}

	private static int getCountLenght3UsingJava7(List<String> strings) {
		int count = 0;
		for (String string : strings) {
			if (string.length() == 3) {
				count++;
			}
		}
		return count;
	}

	private static int getCountEmptyStringUsingJava7(List<String> strings) {
		int count = 0;

		for (String string : strings) {
			if (string.isEmpty())
				count++;
		}
		return count;
	}

	private static List<String> deleteEmptyStringsUsingJava7(List<String> strings) {
		List<String> filteredList = new ArrayList<String>();
		for (String string : strings) {
			if (!string.isEmpty()) {
				filteredList.add(string);
			}
		}
		return filteredList;
	}

	private static String getMergedStringUsingJava7(List<String> strings, String separator) {
		StringBuilder builder = new StringBuilder();
		for (String string : strings) {
			if (!string.isEmpty()) {
				builder.append(string);
				builder.append(separator);
			}
		}
		String mergedString = builder.toString();
		return mergedString.substring(0, mergedString.length() - 2);
	}

	private static List<Integer> getSquares(List<Integer> numbers) {
		List<Integer> squareList = new ArrayList<Integer>();
		for (Integer number : numbers) {
			Integer square = new Integer(number.intValue() * number.intValue());

			if (!squareList.contains(square)) {
				squareList.add(square);
			}
		}
		return squareList;
	}

	private static int getMax(List<Integer> numbers) {
		int max = numbers.get(0);
		for (int i = 1; i < numbers.size(); i++) {

			Integer number = numbers.get(i);
			if (number.intValue() > max) {
				max = number.intValue();
			}
		}
		return max;
	}

	private static int getMin(List<Integer> numbers) {
		int min = numbers.get(0);
		for (int i = 1; i < numbers.size(); i++) {

			Integer number = numbers.get(i);
			if (number.intValue() < min) {
				min = number.intValue();
			}
		}
		return min;
	}

	private static int getSum(List numbers) {
		int sum = (int) (numbers.get(0));

		for (int i = 1; i < numbers.size(); i++) {
			sum += (int) numbers.get(i);
		}
		return sum;
	}

	private static int getAverage(List<Integer> numbers) {
		return getSum(numbers) / numbers.size();
	}
}
