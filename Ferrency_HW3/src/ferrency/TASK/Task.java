package ferrency.TASK;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Task {
	public static String DIR = "C:\\Users\\marti\\git\\intro-java-hw\\Ferrency_HW3\\src\\ferrency\\DATA";
	
	public static void processFile_B(String fn) throws IOException {
		BufferedWriter BW = new BufferedWriter(new FileWriter(DIR + fn));
		
		
	}
}
