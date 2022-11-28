package ferrency.ENGINE;

public class Engine_C extends ShipEngine{
	
	public Engine_C(String starDestroyerType) {
		super("C", starDestroyerType, 225, 75, 15000000, 125);
		if(this.getStarDestroyerType().equals("Imperial_II")) {
			this.setLength(275);
			this.setHeight(80);
			this.setPower(17000000);
		}
	}

	@Override
	public String toString() {
		return "Engine Type: " + getEngineType() + "    Length: " + getLength() + "     Height: " + getHeight()
				+ "     Power: " + getPower() + "     Weight: " + getWeight();
	}
	
}
