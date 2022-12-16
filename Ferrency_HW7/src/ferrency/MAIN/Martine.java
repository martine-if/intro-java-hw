package ferrency.MAIN;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import ferrency.TASK2.ReportMaker;
import ferrency.TASK3.*;
import ferrency.TASK4.Task4;
import ferrency.TASK5.Task5;

public class Martine {
	static String file = "C:\\Users\\marti\\git\\intro-java-hw\\Ferrency_HW7\\src\\ferrency\\TASK2\\PlayerData";
	
	static ArrayList<Integer> isbn =  new ArrayList<Integer>(Arrays.asList(123456789,987654321,564738291,334455662));
	static ArrayList<String> binary =  new ArrayList<String>(Arrays.asList("0000010101010101","0000010111110101","1000010101010101"));
	static ArrayList<String> cards =  new ArrayList<String>(Arrays.asList("4388576018402625","4388576018410707","4388576018419797"));

	
	public static void main(String[] args) throws IOException {
		//Task 2
		ReportMaker.buildPlayerAnalysisReport(file);
		//Task 3
		Task3.checkDigit(isbn);
		//Task 4
		Task4.toDecimal(binary);
		//Task 5
		Task5.validateCards(cards);
	}
}
