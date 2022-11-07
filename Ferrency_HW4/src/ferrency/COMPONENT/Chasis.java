package ferrency.COMPONENT;

import ferrency.ENUMS.Status;

public class Chasis {
	
	private String serialNumber;
	private double height;
	private double weight;
	private Status status;
	
	public Chasis(String serialNumber) {
		this.serialNumber = serialNumber;
		this.status = Status.ONLINE;
	}
	

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}
	
	public boolean chasisCheck() {
		if(this.getStatus() == Status.ONLINE) {
			return true;
		}else {
			return false;
		}
	}
	
}
