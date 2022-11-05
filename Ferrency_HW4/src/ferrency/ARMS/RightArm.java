package ferrency.ARMS;

import ferrency.ENUMS.Side;
import ferrency.ENUMS.Status;

public class RightArm extends Arm {
	private Status status;

	public RightArm() {
		super("RA-02");
		this.status = Status.ONLINE;
		this.setSide(Side.RIGHT);
		this.setPad(RightFoodPad);
		this.setUpper(Upper);
		this.setLower(Lower);
	}

	@Override
	public boolean armCheck() {
		return false;
	}
}
