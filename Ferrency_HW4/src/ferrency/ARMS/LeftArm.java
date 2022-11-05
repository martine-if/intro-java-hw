package ferrency.ARMS;

import ferrency.ENUMS.Side;
import ferrency.ENUMS.Status;

public class LeftArm extends Arm{
	
	private Status status;

	public LeftArm() {
		super("LA-01");
		this.status = Status.ONLINE;
		this.setSide(Side.LEFT);
		this.setPad(LeftFoodPad);
		this.setUpper(Upper);
		this.setLower(Lower);
	}

	@Override
	public boolean armCheck() {
		return false;
	}
		
}
