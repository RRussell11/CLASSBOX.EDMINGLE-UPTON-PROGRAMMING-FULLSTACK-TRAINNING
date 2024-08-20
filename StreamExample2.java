package streampckge;
//Note this class, its use for filter and sorted, as for interv-quest-gd-exmp.
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class StreamExample2 {
	public static void main(String[]args) {
		List<String>words= Arrays.asList("cherry","apple", "banana", "date", "fig");
		List<String> result= words.stream()
		.filter(word-> word.length()>= 5)
		.sorted()
		.collect(Collectors.toList());
		System.out.println("Filtered and Sorted the words" + result);
	}

}
