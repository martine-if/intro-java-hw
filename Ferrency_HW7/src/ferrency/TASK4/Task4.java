package ferrency.TASK4;

import java.util.ArrayList;

public class Task4 {
	public static void toDecimal(ArrayList<String> binary) {
		System.out.println("Binary		 	Decimal");
	    for(int i=0;i<binary.size();i++) {
	    	int j = 0;
	    	int decimal = 0;
		    int last;
		    String current = binary.get(i);
	    	while (current.length()>0) {
	    		last = Character.getNumericValue((current.charAt(current.length() - 1)));
	    		current = current.substring(0,current.length()-1);
	    		decimal += (last * Math.pow(2, j));
	    		j++;
	    	}
	    	System.out.println(binary.get(i) + "	" + decimal);
	    }
	    System.out.println();
	}
}
