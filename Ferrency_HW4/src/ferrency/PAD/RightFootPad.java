package ferrency.PAD;

import ferrency.ENUMS.Side;
import ferrency.ENUMS.Status;

public class RightFootPad extends FootPad{
private Status rightPadStatus;
	
	public RightFootPad() {
		super("LFP-1");
		this.setSide(Side.LEFT);
		this.setRightPadStatus(Status.ONLINE);
	}

	@Override
	public boolean padCheck() {
		if(this.getRightPadStatus() == Status.ONLINE) {
			return true;
		}else {
			return false;
		}
	}

	public Status getRightPadStatus() {
		return rightPadStatus;
	}

	public void setRightPadStatus(Status rightPadStatus) {
		this.rightPadStatus = rightPadStatus;
	}
}
