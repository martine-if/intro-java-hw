package ferrency.TASK5;

import java.util.ArrayList;

public class Task5 {
	public static void validateCards(ArrayList<String> cards) {
		System.out.println("Card Number		V1	V2	SUM	Div10	VALID");
		for(int i=0;i<cards.size();i++) {
			int doubleSum = 0;
			int current;
			int oddSum = 0;
			int sum = 0;
			String valid;
			for(int j=cards.get(i).length()-1;j>=0;j--) {
				if(j%2==0) {
					current = 2*Integer.parseInt(cards.get(i).substring(j,j+1));
					if(current>=10) {	
						current = Integer.parseInt(Integer.toString(current).substring(0,1))+Integer.parseInt(Integer.toString(current).substring(1,2));
					}
					doubleSum += current;
				}else {
					oddSum += Integer.parseInt(cards.get(i).substring(j,j+1));
				}
			}
			sum = doubleSum + oddSum;
			if(sum % 10 == 0) {
				valid = "VALID";
			}
			else {
				valid = "INVALID";
			}
			System.out.println(cards.get(i) + "	" + doubleSum + "	" + oddSum + "	" + sum + "	" + (double)sum / 10 + "	" + valid);
		}
		System.out.println();
	}
}
