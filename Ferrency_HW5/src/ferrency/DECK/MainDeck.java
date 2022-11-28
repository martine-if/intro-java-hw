package ferrency.DECK;

public class MainDeck extends ShipDeck{
	public MainDeck(String starDestroyerType) {
		super("MainDeck", starDestroyerType, 600, 50, 400, 250);
		if(this.getStarDestroyerType().equals("Imperial_II")) {
			this.setLength(700);
			this.setHeight(56);
			this.setWidth(450);
			this.setWeight(300);
		}
	}
	public String toString() {
		return "Main Deck: DeckType: " + getDeckType() + "	Star Destroyer Type: " + getStarDestroyerType()
				+ " Length: " + getLength() + "     Height: " + getHeight() + "     Width: " + getWidth()
				+ "     Weight: " + getWeight();
	}
}
