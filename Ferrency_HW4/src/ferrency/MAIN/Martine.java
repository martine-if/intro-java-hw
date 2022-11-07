package ferrency.MAIN;

import ferrency.ENUMS.Status;
import ferrency.FACTORY.R3Factory;
import ferrency.FACTORY.R4Factory;

public class Martine {
	public static void main(String[] args) {
		R3Factory R3F = new R3Factory("R3FAC");
		R4Factory R4F = new R4Factory("R4FAC");
		
		System.out.println();
		R3F.buildDroids(1);
		R4F.buildDroids(1);
		
		R3F.displayAllDroids();
		System.out.println();
		R4F.displayAllDroids();
		
		R3F.getDroidStorage().get(0).getLeftArm().setLeftArmStatus(Status.OFFLINE);
		R3F.getDroidStorage().get(0).checkStatus();
	}
}
