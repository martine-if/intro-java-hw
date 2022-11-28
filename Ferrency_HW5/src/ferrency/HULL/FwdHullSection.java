package ferrency.HULL;

public class FwdHullSection extends HullSection{

	public FwdHullSection(String starDestroyerType) {
		super("Fwd", starDestroyerType, 900, 100, 75, 350);
		if(this.getStarDestroyerType().equals("Imperial_II")) {
			this.setWidth(200);
			this.setWeight(400);
		}
	}
	
	public String toString() {
		return "Forward Hull: HullType: " + getHullType() + "     Length: " + getLength() + "     Height: " + getHeight() 
				+ "     Width: " + getWidth() + "     Weight: " + getWeight();
	}
}
