package ferrency.DROID;
import ferrency.INTERFACES.Droid;

public abstract class AstromechDroid implements Droid {
	String serialNumber;
	double height;
	double weight;
	
	SensorDome dome;
	Chasis chasis;
	LeftArm leftArm;
	RightArm rightArm;
	
	public AstromechDroid(String serialNumber, double height, double weight, SensorDome dome, Chasis chasis, LeftArm leftArm, RightArm rightArm) {
		this.serialNumber = serialNumber;
		this.height = height;
		this.weight = weight;
		this.dome = dome;
		this.chasis = chasis;
		this.leftArm = leftArm;
		this.rightArm = rightArm;
	}
	
	public abstract void checkStatus() {
		//
	}
}
