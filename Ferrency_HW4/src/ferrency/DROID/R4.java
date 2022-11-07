package ferrency.DROID;

import ferrency.ARMS.LeftArm;
import ferrency.ARMS.RightArm;
import ferrency.COMPONENT.Chasis;
import ferrency.COMPONENT.SensorDome;
import ferrency.ENUMS.Battery;
import ferrency.ENUMS.Radar;
import ferrency.ENUMS.Status;

public class R4 extends AstromechDroid{
	
	Status R4Status;
	Battery R4Battery;
	Radar R4Radar;
	
	public R4(String serialNumber) {
		super(serialNumber);
		this.R4Status = Status.ONLINE;
		this.R4Battery = Battery.R4;
		this.R4Radar = Radar.R4R;
		this.setDome(new SensorDome(this.getSerialNumber()));
		this.getDome().setHeight(2);
		this.getDome().setWeight(150);
		this.setChasis(new Chasis(this.getSerialNumber()));
		this.getChasis().setHeight(5);
		this.getChasis().setWeight(500);
		this.setLeftArm(new LeftArm());
		this.setRightArm(new RightArm());
		this.setHeight(this.getDome().getHeight() + this.getChasis().getHeight());
		this.setWeight(this.getDome().getWeight() + this.getChasis().getWeight());
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
		System.out.println("R4 Astromech");
		System.out.println("Serial Number: " + this.getSerialNumber());
		System.out.println("Status: " + R4Status);
		System.out.println("Battery: " + R4Battery.getType());
		System.out.println("Sensor Dome Serial Number " + this.getDome().getSerialNumber());
		System.out.println("Chasis Serial Number " + this.getChasis().getSerialNumber());
		System.out.println("Left Arm Serial Number " + this.getLeftArm().getSerialNumber());
		System.out.println("Right Arm Serial Number " + this.getRightArm().getSerialNumber());
		System.out.println();
	}
}
