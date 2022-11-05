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
		//
	}
	
	public void displayDroid() {
		//display info 
	}
}
