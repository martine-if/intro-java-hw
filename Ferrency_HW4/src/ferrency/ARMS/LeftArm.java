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
	
	//Checks that status of the LeftArmStatus is ONLINE and the status of the its pad is also
	//ONLINE if so, returns true otherwise sets the LeftArmStatus to OFFLINE and returns false.
	
	@Override
	public boolean armCheck() {
		if(getLeftArmStatus() == Status.ONLINE && this.getPad().padCheck()) {
			return true;
		}
		else {
			this.setLeftArmStatus(Status.OFFLINE);
			return false;
		}
	}

	public Status getLeftArmStatus() {
		return leftArmStatus;
	}

	public void setLeftArmStatus(Status leftArmStatus) {
		this.leftArmStatus = leftArmStatus;
	}
		
}
