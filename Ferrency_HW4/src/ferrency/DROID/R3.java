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
		//
	}
	
	public void displayDroid() {
		//display info 
	}
	
}
