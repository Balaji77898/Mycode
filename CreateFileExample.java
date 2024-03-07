package Specialone;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFileExample {

	public static void main(String[] args) {
		String fileName = "example.txt";
		String content = "Hello,this is some content to write to the file.";
		try {
			createFile(fileName,content);
			System.out.println("File created successfully.");
		}   catch (IOException e){
			System.out.println("An error occurred.");
			e.printStackTrace();
			
			}
		}
	public static void createFile(String fileName,String content)throws IOException {
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
			writer.write(content);
			
		}

	}

}
