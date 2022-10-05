package ferrency.TASK;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Task {
	public static String DIR = "C:\\Users\\marti\\git\\intro-java-hw\\Ferrency_HW3\\src\\ferrency\\DATA\\";
	
	public static void processFile_B(String fn) throws IOException {
		BufferedReader BR = new BufferedReader(new FileReader(DIR + fn));
		
		int count = (int)Files.lines(Paths.get(DIR + fn)).count();
		String[] lines = new String[count];
		
		for(int i=0;i<count;i++) {
			lines[i] = BR.readLine();
		}
		for(String i:lines) {
			System.out.println(i);
		}
		BR.close();
	}
}
