package sample3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.function.BiConsumer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("output.txt");
        String textToAdd = "This is a new line.6";

        BiConsumer<String, File> appendToFile = (text, f) -> {
            try (FileWriter writer = new FileWriter(f, true)) { 
                writer.write(text + System.lineSeparator());
            } catch (IOException e) {
                System.err.println("Error writing to file: " + e.getMessage());
            }
        };

        appendToFile.accept(textToAdd, file);

        System.out.println("Text added to file: " + file.getAbsolutePath());
    }
}
	


