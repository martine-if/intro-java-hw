package ferrency.DROID;

import ferrency.ARMS.*;
import ferrency.COMPONENT.*;
import ferrency.ENUMS.Battery;
import ferrency.ENUMS.Status;

public class R3 extends AstromechDroid{
	
	Status R3Status;
	Battery R3Battery;
	
	public R3(String serialNumber) {
		super(serialNumber);
		this.R3Status = Status.ONLINE;
		this.R3Battery = Battery.R3;
		this.setDome(new SensorDome(this.getSerialNumber()));
		this.getDome().setHeight(2);
		this.getDome().setWeight(200);
		this.setChasis(new Chasis(this.getSerialNumber()));
		this.getChasis().setHeight(4);
		this.getChasis().setWeight(400);
		this.setLeftArm(new LeftArm());
		this.setRightArm(new RightArm());
		this.setHeight(this.getDome().getHeight() + this.getChasis().getHeight());
		this.setWeight(this.getDome().getWeight() + this.getChasis().getWeight());
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
		System.out.println("Battery: " + R3Battery.getType());
		System.out.println("Sensor Dome Serial Number " + this.getDome().getSerialNumber());
		System.out.println("Chasis Serial Number " + this.getChasis().getSerialNumber());
		System.out.println("Left Arm Serial Number " + this.getLeftArm().getSerialNumber());
		System.out.println("Right Arm Serial Number " + this.getRightArm().getSerialNumber());
	}
	
}
