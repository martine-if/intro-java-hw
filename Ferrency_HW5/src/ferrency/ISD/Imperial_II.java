package ferrency.ISD;

import ferrency.BAY.FBay;
import ferrency.BAY.PBay;
import ferrency.BAY.SBay;
import ferrency.DECK.Bridge;
import ferrency.DECK.Deck;
import ferrency.DECK.MainDeck;
import ferrency.DECK.TopDeck;
import ferrency.ENGINE.Engine;
import ferrency.ENGINE.Engine_C;
import ferrency.ENGINE.Engine_S;
import ferrency.ENGINE.ShipEngine;
import ferrency.HULL.AftHullSection;
import ferrency.HULL.FwdHullSection;
import ferrency.HULL.Hull;

public class Imperial_II extends StarDestroyer{
	
	public Imperial_II(String shpNumber, String shpName) {
		super(shpNumber, shpName);
		this.setShpClass("Imperial_II");
		this.setShpCrew(12000);
		this.setShpHulls(new Hull("H2", this.getShpClass()));
		this.getShpHulls().setSectionAFT(new AftHullSection(this.getShpClass()));
		this.getShpHulls().setSectionFWD(new FwdHullSection(this.getShpClass()));
		this.setShpDecks(new Deck("D2", this.getShpClass()));
		this.getShpDecks().setDeck_Bridge(new Bridge(this.getShpClass()));
		this.getShpDecks().setDeck_Main(new MainDeck(this.getShpClass()));
		this.getShpDecks().setDeck_Top(new TopDeck(this.getShpClass()));
		this.setShpEngines(new Engine("E2",this.getShpClass()));
		ShipEngine[] engines = new ShipEngine[3];
		engines[0] = new Engine_S(this.getShpClass());
		engines[1] = new Engine_C(this.getShpClass());
		engines[2] = new Engine_S(this.getShpClass());
		this.getShpEngines().setEngines(engines);
		this.setForwardBay(new FBay("FB-2",this.getShpClass()));
		this.setPortBay(new PBay("PB-2", this.getShpClass()));
		this.setStarboardBay(new SBay("SB-2", this.getShpClass()));
	}
	
	public void displayImperial_II() {
		this.displayInfo();
	}
	
	@Override
	public void navigatesToPosition(String p) {
		System.out.println(this.getShpName() + " navigates to position " + p);
	}

	@Override
	public boolean launchFighters() {
		System.out.println("The fighters have been launched");
		return true;
	}

}
