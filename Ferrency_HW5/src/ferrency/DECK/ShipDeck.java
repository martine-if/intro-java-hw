package ferrency.DECK;

public abstract class ShipDeck {

	private String DeckType;
	private String StarDestroyerType;
	private int length;
	private int width;
	private int height;
	private int weight;
	
	public ShipDeck() {
		
	}
	
	public ShipDeck(String deckType, String starDestroyerType, int length,  int height, int width, int weight) {
		this.DeckType = deckType;
		this.StarDestroyerType = starDestroyerType;
		this.length = length;
		this.width = width;
		this.height = height;
		this.weight = weight;
	}
	
	
	public String getDeckType() {
		return DeckType;
	}

	public void setDeckType(String deckType) {
		DeckType = deckType;
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

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String DeckInfo() {
		return this.toString();
	}

	@Override
	public String toString() {
		return "ShipDeck [DeckType=" + DeckType + ", StarDestroyerType=" + StarDestroyerType + ", length=" + length
				+ ", width=" + width + ", height=" + height + ", weight=" + weight + "]";
	}
	
	
}
