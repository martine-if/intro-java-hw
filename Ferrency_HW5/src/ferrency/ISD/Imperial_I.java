package ferrency.ISD;

import ferrency.BAY.*;
import ferrency.DECK.*;
import ferrency.ENGINE.*;
import ferrency.HULL.*;

public class Imperial_I extends StarDestroyer{

	public Imperial_I(String shpNumber, String shpName) {
		super(shpNumber, shpName);
		this.setShpClass("Imperial_I");
		this.setShpCrew(9000);
		this.setShpHulls(new Hull("H1", this.getShpClass()));
		this.getShpHulls().setSectionAFT(new AftHullSection(this.getShpClass()));
		this.getShpHulls().setSectionFWD(new FwdHullSection(this.getShpClass()));
		this.setShpDecks(new Deck("D1", this.getShpClass()));
		this.getShpDecks().setDeck_Bridge(new Bridge(this.getShpClass()));
		this.getShpDecks().setDeck_Main(new MainDeck(this.getShpClass()));
		this.getShpDecks().setDeck_Top(new TopDeck(this.getShpClass()));
		this.setShpEngines(new Engine("E1",this.getShpClass()));
		ShipEngine[] engines = new ShipEngine[3];
		engines[0] = new Engine_S(this.getShpClass());
		engines[1] = new Engine_C(this.getShpClass());
		engines[2] = new Engine_S(this.getShpClass());
		this.getShpEngines().setEngines(engines);
		this.setForwardBay(new FBay("Forward Bay","FB-1"));
		this.setPortBay(new PBay("Port Bay","PB-1"));
		this.setStarboardBay(new SBay("Starboard Bay","SB-1"));
	}
	
	public void displayImperial_I(){
		this.displayInfo();
	}

	@Override
	public boolean launchFighters() {
		System.out.println("The fighters have been launched");
		return true;
	}

	@Override
	public void navigatesToPosition(String p) {
		System.out.println(this.getShpName() + " navigates to position " + p);
		
	}


	
	
}
