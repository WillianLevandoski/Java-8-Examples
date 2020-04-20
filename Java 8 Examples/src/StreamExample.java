import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample {
	
	public static void main(String[] args) {
		
		//Collection
		List<Integer> list = Arrays.asList(1,2,3);
		list.stream().forEach(System.out::println);
		
		//Arrays
		Integer[] intArray = new Integer[] {1,2,3};
		Arrays.stream(intArray).forEach(System.out::println);
		
		//Stream.of
		Stream.of("Test", "print", "line").forEach(System.out::println);
		
		//Range
		System.out.println("Range");
		IntStream.range(0,3).forEach(System.out::println);//0,1,2
		
		//RangeClosed
		System.out.println("RangeClosed");
		IntStream.rangeClosed(0,3).forEach(System.out::println);//0,1,2,3
		
		//Interate
		Stream.iterate(5, n -> n*2).limit(3).forEach(System.out::println);
		
		String s = "Pattern example";
		Pattern pa = Pattern.compile(" ");
		pa.splitAsStream(s).forEach(System.out::println);

	}
	
	

}
