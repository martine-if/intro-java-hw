package ferrency.ARMS;

import ferrency.ENUMS.Limb;
import ferrency.ENUMS.Side;
import ferrency.ENUMS.Status;
import ferrency.PAD.LeftFootPad;

public class LeftArm extends Arm{
	
	private Status leftArmStatus;

	public LeftArm() {
		super("LA-01");
		this.setLeftArmStatus(Status.ONLINE);
		this.setSide(Side.LEFT);
		this.setPad(new LeftFootPad());
		this.setUpper(Limb.Upper);
		this.setLower(Limb.Lower);
	}

	@Override
	public boolean armCheck() {
		return false;
	}

	public Status getLeftArmStatus() {
		return leftArmStatus;
	}

	public void setLeftArmStatus(Status leftArmStatus) {
		this.leftArmStatus = leftArmStatus;
	}
		
}
