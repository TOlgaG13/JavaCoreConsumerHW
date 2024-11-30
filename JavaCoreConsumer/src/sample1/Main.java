package sample1;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = Arrays.asList(10, 13, 16, 17, 22, 3);
		Consumer<Integer> oddNumbers = number -> {
			if (number % 2 != 0) {
				System.out.println(number);
			}
		};

		numbers.forEach(oddNumbers);
	}

}
