package ferrency.ARMS;

import ferrency.ENUMS.Limb;
import ferrency.ENUMS.Side;
import ferrency.PAD.FootPad;

public abstract class Arm {

	private String serialNumber;
	private Side side;
	private Limb upper;
	private Limb lower;
	private FootPad pad;

	public Arm(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public Side getSide() {
		return side;
	}

	public void setSide(Side side) {
		this.side = side;
	}

	public Limb getUpper() {
		return upper;
	}

	public void setUpper(Limb upper) {
		this.upper = upper;
	}

	public Limb getLower() {
		return lower;
	}

	public void setLower(Limb lower) {
		this.lower = lower;
	}

	public FootPad getPad() {
		return pad;
	}

	public void setPad(FootPad pad) {
		this.pad = pad;
	}

	public abstract boolean armCheck();

}
