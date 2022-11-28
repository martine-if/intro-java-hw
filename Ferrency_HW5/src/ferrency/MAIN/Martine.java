package ferrency.MAIN;

import ferrency.FACTORY.*;

public class Martine {
	public static void main(String[] args) {
		ISD1_Factory I1F = new ISD1_Factory("I1F_1");
		
		I1F.buildISDs(1);
		I1F.displayISDs();
		
	}
}
