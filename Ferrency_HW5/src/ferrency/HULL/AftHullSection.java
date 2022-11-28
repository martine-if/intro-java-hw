package ferrency.HULL;

public class AftHullSection extends HullSection {
	
	public AftHullSection(String starDestroyerType) {
		super("Aft", starDestroyerType, 700, 200, 325, 550);
		if(this.getStarDestroyerType().equals("Imperial_II")) {
			this.setLength(900);
			this.setHeight(275);
			this.setWidth(300);
			this.setWeight(700);
		}
	}

	@Override
	public String toString() {
		return "Aft Hull: HullType: " + getHullType() + " Length: " + getLength() + "     Height: " + getHeight() 
				+ "     Width: " + getWidth() + "     Weight: " + getWeight();
	}
	
}
