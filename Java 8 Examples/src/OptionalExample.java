import java.util.Optional;

public class OptionalExample {
	private static String validNumber = "1";
	private static String invalidNumber = "This is not a number";
	
	
	public static void main(String[] args) {
		ifPresentExample();
		orElseExample();
		orElseGetExample();
		orElseThrowExample();
	}

	private static void ifPresentExample() {
		//Print a valid number
		convertToNumber(validNumber).ifPresent(n -> System.out.println(n));
		
		//Execute a lambda function
		convertToNumber(invalidNumber).ifPresent(n -> System.out.println(n));
	}
	
	private static void orElseThrowExample() {
		//Print a valid number
		Integer convertedValidNumber = convertToNumber(validNumber).orElseThrow(() -> new NullPointerException("Invalid Number"));
		System.out.println(convertedValidNumber);
		
		//Display a Throw Exepction
		Integer convertedInvalidNumber = convertToNumber(invalidNumber).orElseThrow(() -> new NullPointerException("Invalid Number"));
		System.out.println(convertedInvalidNumber);
	}

	private static void orElseGetExample() {
		//Print a valid number
		Integer convertedValidNumber = convertToNumber(validNumber).orElseGet(() -> 5);
		System.out.println(convertedValidNumber);
		
		//Execute a lambda fumction
		Integer convertedInvalidNumber = convertToNumber(invalidNumber).orElseGet(() -> 5);
		System.out.println(convertedInvalidNumber);
		
	}

	private static void orElseExample() {
		//Print a valid number
		Integer convertedValidNumber = convertToNumber(validNumber).orElse(2);
		System.out.println(convertedValidNumber);
		
		//Print a default value
		Integer convertedInvalidNumber = convertToNumber(invalidNumber).orElse(2);
		System.out.println(convertedInvalidNumber);
	}



	public static Optional<Integer> convertToNumber(String strNumber) {
		try {
			return  Optional.of(Integer.valueOf(strNumber));
		}catch (Exception e) {
			return Optional.empty();
		}
	}

}
