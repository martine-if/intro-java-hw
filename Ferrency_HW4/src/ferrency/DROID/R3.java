package ferrency.DROID;

import ferrency.ENUMS.Battery;
import ferrency.ENUMS.Status;

public class R3 extends AstromechDroid{
	
	Status R3Status = Status.ONLINE;
	Battery R3Battery = Battery.R3;
	
	public R3(String serialNumber) {
		super(serialNumber);
	}


	@Override
	public void checkStatus() {
		if(this.getDome().getStatus() == Status.OFFLINE || this.getChasis().getStatus() == Status.OFFLINE || this.getLeftArm().getLeftArmStatus() == Status.OFFLINE || this.getRightArm().getRightArmStatus() == Status.OFFLINE) {
			System.out.println("R3 Astromech is OFFLINE");
			R3Status = Status.OFFLINE;
		}
		else{
			System.out.println("R3 Astromech is ONLINE");
			R3Status = Status.ONLINE;
		}
	}
	
	public void displayDroid() {
		//display info 
		System.out.println("R3 Astromech");
		System.out.println("Serial Number: " + this.getSerialNumber());
		System.out.println("Status: " + R3Status);
		System.out.println("Battery: " + R3Battery);
		System.out.println("Sensor Dome Serial Number " + this.getDome().getSerialNumber());
		System.out.println("Chasis Serial Number " + this.getChasis().getSerialNumber());
		System.out.println("Left Arm Serial Number " + this.getLeftArm().getSerialNumber());
		System.out.println("Right Arm Serial Number " + this.getRightArm().getSerialNumber());
		System.out.println();
		checkStatus();
		
	}
	
}
