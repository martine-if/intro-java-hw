package ferrency.TASK3;

import java.util.ArrayList;

public class Task3 {
	public static void checkDigit(ArrayList<Integer> isbn) {
		int sum = 0;
		System.out.println("ISBN(first 9)	 	Check Sum Digit");
		for(int i=0;i<isbn.size();i++) {
			String current = isbn.get(i).toString();
			for(int j=0;j<current.length();j++) {
				sum += Integer.parseInt(current.substring(j,j+1))*(j+1);
			}
			sum = sum % 11;
			if(sum == 10) {
				System.out.println(current + "		X");
			}
			else {
				System.out.println(current + "		" + sum);
			}
			sum = 0;
		}
		System.out.println();
	}
}
