package ferrency.DECK;

public class TopDeck extends ShipDeck{
	public TopDeck(String starDestroyerType) {
		super("TopDeck", starDestroyerType, 300, 30, 250, 125);
		if(this.getStarDestroyerType().equals("Imperial_II")) {
			this.setLength(350);
			this.setHeight(34);
			this.setWidth(300);
			this.setWeight(150);
		}
	}
	public String toString() {
		return "Top Deck: DeckType: " + getDeckType() + "	Star Destroyer Type: " + getStarDestroyerType()
				+ " Length: " + getLength() + "     Height: " + getHeight() + "     Width: " + getWidth()
				+ "     Weight: " + getWeight();
	}
}
