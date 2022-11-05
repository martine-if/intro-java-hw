package ferrency.PAD;

import ferrency.ENUMS.Side;
import ferrency.ENUMS.Status;

public class LeftFootPad extends FootPad{
	
	private Status leftPadStatus;
	
	public LeftFootPad() {
		super("LFP-1");
		this.setSide(Side.LEFT);
		this.setLeftPadStatus(Status.ONLINE);
	}

	@Override
	public boolean padCheck() {
		return false;
	}

	public Status getLeftPadStatus() {
		return leftPadStatus;
	}

	public void setLeftPadStatus(Status leftPadStatus) {
		this.leftPadStatus = leftPadStatus;
	}

}
