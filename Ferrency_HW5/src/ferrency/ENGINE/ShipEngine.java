package ferrency.ENGINE;

public abstract class ShipEngine {

	private String EngineType;
	private String StarDestroyerType;
	private int length;
	private int height;
	private int power;
	private int weight;

	public ShipEngine(String engineType, String starDestroyerType, int length, int height, int power, int weight) {
		this.EngineType = engineType;
		this.StarDestroyerType = starDestroyerType;
		this.length = length;
		this.height = height;
		this.power = power;
		this.weight = weight;
	}

	public String getEngineType() {
		return EngineType;
	}

	public void setEngineType(String engineType) {
		EngineType = engineType;
	}

	public String getStarDestroyerType() {
		return StarDestroyerType;
	}

	public void setStarDestroyerType(String starDestroyerType) {
		StarDestroyerType = starDestroyerType;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String EngineInfo() {
		return this.toString();
	}

	@Override
	public String toString() {
		return "ShipEngine [EngineType=" + EngineType + ", StarDestroyerType=" + StarDestroyerType + ", length="
				+ length + ", height=" + height + ", power=" + power + ", weight=" + weight + "]";
	}
	
	
	
}
