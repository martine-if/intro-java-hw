package ferrency.ENGINE;

public class Engine_S extends ShipEngine {

	public Engine_S(String starDestroyerType) {
		super("S", starDestroyerType, 100, 50, 8000000, 100);
		if(this.getStarDestroyerType().equals("Imperial_II")) {
			this.setLength(115);
			this.setHeight(60);
			this.setPower(9000000);
		}
	}

	public String toString() {
		return "Engine Type: " + getEngineType() + "      Length: " + getLength() + "     Height: " + getHeight() 
				+ "     Power: " + getPower() + "     Weight: " + getWeight();
	}
}
