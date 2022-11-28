package ferrency.DECK;

public class Bridge extends ShipDeck{

	public Bridge(String starDestroyerType) {
		super("Bridge", starDestroyerType, 150, 20, 100, 75);
		if(this.getStarDestroyerType().equals("Imperial_II")) {
			this.setLength(200);
			this.setHeight(22);
			this.setWidth(150);
			this.setWeight(100);
		}
	}

	@Override
	public String toString() {
		return "Bridge: DeckType: " + getDeckType() + "	Star Destroyer Type: " + getStarDestroyerType()
				+ " Length: " + getLength() + "     Height: " + getHeight() + "     Width: " + getWidth()
				+ "     Weight: " + getWeight();
	}
	
	
	
}
