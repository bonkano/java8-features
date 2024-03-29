
public class LambdaExemple {

	public static void main(String[] args) {
		LambdaExemple tester = new LambdaExemple();

		// with type declaration
		MathOperation addition = (int a, int b) -> a + b;

		// without type declaration
		MathOperation substraction = (a, b) -> a - b;

		// with return statement along with curly braces
		MathOperation multiplication = (int a, int b) -> {
			return a * b;
		};

		// without return statement and without curly braces
		MathOperation division = (int a, int b) -> a / b;

		System.out.println("10 + 5 = " + tester.operate(10, 5, addition));
		System.out.println("10 - 5 = " + tester.operate(10, 5, substraction));
		System.out.println("10 * 5 = " + tester.operate(10, 5, multiplication));
		System.out.println("10 / 5 = " + tester.operate(10, 5, division));
		
		// without parenthesis
		GreetingService greetingService1 = message -> System.out.println("Hello " + message);
		
		// with parenthesis 
		GreetingService greetingService2 = (message) -> System.out.println("Hello " + message);
		
		greetingService1.sayMessage("Momo");
		greetingService2.sayMessage("Bebe");
	}

	interface MathOperation {
		int operation(int a, int b);
	}

	interface GreetingService {
		void sayMessage(String message);
	}

	private int operate(int a, int b, MathOperation mathOperation) {
		return mathOperation.operation(a, b);
	}
}