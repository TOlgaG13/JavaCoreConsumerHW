package sample2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   List<String> strings = List.of("abcd", "123", "city12", "world", "30alsoGood1");
	        List<String> stringsWithDigits = new ArrayList<>();

	        Consumer<String> addStringsWithDigits = str -> {
	            if (str.matches(".*\\d.*")) {
	                stringsWithDigits.add(str);
	            }
	        };

	        strings.forEach(addStringsWithDigits);

	        System.out.println("Strings containing digits: " + stringsWithDigits);
	    }
	}
	


