package ferrency.TASK;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import ferrency.HELPER.Helper;

public class Task {
	public static String DIR = "C:\\Users\\marti\\git\\intro-java-hw\\Ferrency_HW3\\src\\ferrency\\DATA\\";
	
	public static void processFile_B(String fn) throws IOException {
		//create new Reader with the MessageFile as input
		BufferedReader BR = new BufferedReader(new FileReader(DIR + fn));
		//count the number of lines in the file
		int count = (int)Files.lines(Paths.get(DIR + fn)).count();
		String[] lines = new String[count/2];
		//read the lines of the file into an array of Strings, excluding "Data Transmission Complete"
		int x = 0;
		while(x < count/2) {
			lines[x] = BR.readLine();
			x++;
			BR.readLine();
		}
		BR.close();
		
		//for each line, format and print correctly
		for(String i:lines) {
			Helper.formatString(i);
		}
	}
}
