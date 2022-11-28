package ferrency.ENGINE;

public class Engine {
	private String IDNumber;
	private ShipEngine[] Engines;
	
	public Engine(String IDNumber, String StarDestroyerType) {
		this.IDNumber = IDNumber;
	}

	public String getIDNumber() {
		return IDNumber;
	}

	public void setIDNumber(String iDNumber) {
		IDNumber = iDNumber;
	}

	public ShipEngine[] getEngines() {
		return Engines;
	}

	public void setEngines(ShipEngine[] engines) {
		Engines = engines;
	}

	public void displayEngineSpecs() {
		System.out.println("________Engine Specifications________");
		System.out.println("ENGINES: " + this.getIDNumber());
		System.out.println("Starboard Engine: " + this.getEngines()[0].toString());
		System.out.println("Center Engine: " + this.getEngines()[1].toString());
		System.out.println("Port Engine: " + this.getEngines()[2].toString());
	}

	
	
}
