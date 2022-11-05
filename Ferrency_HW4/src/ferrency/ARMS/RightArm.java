package ferrency.ARMS;

import ferrency.ENUMS.Side;
import ferrency.ENUMS.Status;

public class RightArm extends Arm {
	private Status rightArmStatus;

	public RightArm() {
		super("RA-02");
		this.rightArmStatus = Status.ONLINE;
		this.setSide(Side.RIGHT);
		this.setPad(RightFoodPad);
		this.setUpper(Upper);
		this.setLower(Lower);
	}

	@Override
	public boolean armCheck() {
		return false;
	}

	public Status getRightArmStatus() {
		return rightArmStatus;
	}

	public void setRightArmStatus(Status rightArmStatus) {
		this.rightArmStatus = rightArmStatus;
	}
}
