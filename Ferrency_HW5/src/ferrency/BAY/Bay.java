package ferrency.BAY;

public abstract class Bay {

	private String BayName;
	private String BayID;
	private String BayType;
	
	public Bay() {
		
	}
	public Bay(String bayName, String bayID, String bayType) {
		this.BayName = bayName;
		this.BayID = bayID;
		this.BayType = bayType;
	}
	
	public String getBayName() {
		return BayName;
	}
	public void setBayName(String bayName) {
		BayName = bayName;
	}
	public String getBayID() {
		return BayID;
	}
	public void setBayID(String bayID) {
		BayID = bayID;
	}
	public String getBayType() {
		return BayType;
	}
	public void setBayType(String bayType) {
		BayType = bayType;
	}
	public abstract void displayBayInfo();
}
