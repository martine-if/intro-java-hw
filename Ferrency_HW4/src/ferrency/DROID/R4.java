package ferrency.DROID;

import ferrency.ENUMS.Battery;
import ferrency.ENUMS.Radar;
import ferrency.ENUMS.Status;

public class R4 extends AstromechDroid{
	
	Status R4Status = Status.ONLINE;
	Battery R4Battery = Battery.R4;
	Radar R4Radar = Radar.R4R;
	
	public R4(String serialNumber) {
		super(serialNumber);
	}

	@Override
	public void checkStatus() {
		if(this.getDome().getStatus() == Status.OFFLINE || this.getChasis().getStatus() == Status.OFFLINE || this.getLeftArm().getLeftArmStatus() == Status.OFFLINE || this.getRightArm().getRightArmStatus() == Status.OFFLINE) {
			System.out.println("R3 Astromech is OFFLINE");
			R4Status = Status.OFFLINE;
		}
		else{
			System.out.println("R3 Astromech is ONLINE");
			R4Status = Status.ONLINE;
		}
	}
	
	public void displayDroid() {
		//display info 
		System.out.println("R3 Astromech");
		System.out.println("Serial Number: " + this.getSerialNumber());
		System.out.println("Status: " + R4Status);
		System.out.println("Battery: " + R4Battery);
		System.out.println("Sensor Dome Serial Number " + this.getDome().getSerialNumber());
		System.out.println("Chasis Serial Number " + this.getChasis().getSerialNumber());
		System.out.println("Left Arm Serial Number " + this.getLeftArm().getSerialNumber());
		System.out.println("Right Arm Serial Number " + this.getRightArm().getSerialNumber());
	}
}
