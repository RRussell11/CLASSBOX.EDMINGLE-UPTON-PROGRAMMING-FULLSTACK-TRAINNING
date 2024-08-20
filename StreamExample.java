package streampckge;

import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {

	public static void main(String[] args) {
		List<Integer> numbers= Arrays.asList(1,2,3,4,5,6,7,8,9,10); 
		List<Integer> OddNumbers= numbers.stream()
		                                 .filter(n-> n % 2 != 0)
		                                 .collect( Collectors.toList());   
		System.out.println("Odd Numbers " +  OddNumbers);
		System.out.println(" numbers:" + numbers);
	}

}
	
   /* List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    List<Integer> oddNumbers = numbers.stream()
                                      .filter(n -> n % 2 != 0)
                                      .collect(Collectors.toList());
    System.out.println("Odd Numbers: " + oddNumbers);
}
}*/
