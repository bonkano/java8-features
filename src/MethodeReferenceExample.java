import java.util.ArrayList;
import java.util.List;

public class MethodeReferenceExample {
	
	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		
		names.add("Ali");
		names.add("Baba");
		names.add("Toto");
		names.add("Jack");
		
		//names.forEach(System.out::println);
		
		names.stream().forEach(System.out::println);
	}	
	
}
