package ferrency.DECK;

public class Deck {
	private String IDNumber;
	private Bridge Deck_Bridge;
	private TopDeck Deck_Top;
	private MainDeck Deck_Main;

	public Deck(String IDNumber, String StarDestroyerType) {
		this.IDNumber = IDNumber;
	}

	public String getIDNumber() {
		return IDNumber;
	}

	public void setIDNumber(String iDNumber) {
		IDNumber = iDNumber;
	}

	public Bridge getDeck_Bridge() {
		return Deck_Bridge;
	}

	public void setDeck_Bridge(Bridge deck_Bridge) {
		Deck_Bridge = deck_Bridge;
	}

	public TopDeck getDeck_Top() {
		return Deck_Top;
	}

	public void setDeck_Top(TopDeck deck_Top) {
		Deck_Top = deck_Top;
	}

	public MainDeck getDeck_Main() {
		return Deck_Main;
	}

	public void setDeck_Main(MainDeck deck_Main) {
		Deck_Main = deck_Main;
	}

	public void displayDeckSpecs() {
		System.out.println("________Deck Specifications________");
		System.out.println("DECK: " + this.getIDNumber());
		System.out.println(this.getDeck_Bridge().toString());
		System.out.println(this.getDeck_Top().toString());
		System.out.println(this.getDeck_Main().toString());
		
		
	}

}
