package ferrency.ARMS;

import ferrency.ENUMS.Limb;
import ferrency.ENUMS.Side;
import ferrency.ENUMS.Status;
import ferrency.PAD.RightFootPad;

public class RightArm extends Arm {
	private Status rightArmStatus;

	public RightArm() {
		super("RA-02");
		this.rightArmStatus = Status.ONLINE;
		this.setSide(Side.RIGHT);
		this.setPad(new RightFootPad());
		this.setUpper(Limb.Upper);
		this.setLower(Limb.Lower);
	}

	@Override
	public boolean armCheck() {
		if(getRightArmStatus() == Status.ONLINE && this.getPad().padCheck()) {
			return true;
		}
		else {
			this.setRightArmStatus(Status.OFFLINE);
			return false;
		}
	}

	public Status getRightArmStatus() {
		return rightArmStatus;
	}

	public void setRightArmStatus(Status rightArmStatus) {
		this.rightArmStatus = rightArmStatus;
	}
}
