package ferrency.ISD;

import ferrency.BAY.*;
import ferrency.DECK.Deck;
import ferrency.ENGINE.Engine;
import ferrency.HULL.Hull;
import ferrency.INTERFACES.Docks;
import ferrency.INTERFACES.Launches;
import ferrency.INTERFACES.Maneuvers;

public abstract class StarDestroyer implements Docks, Launches, Maneuvers{

	private String ShpNumber;
	private String ShpType = "StarDestroyer";
	private String ShpName;
	private String ShpClass;
	private int ShpCrew;
	private Hull ShpHulls;
	private Deck ShpDecks;
	private Engine ShpEngines;
	private SBay StarboardBay;
	private PBay PortBay;
	private FBay ForwardBay;

	public StarDestroyer() {

	}

	public StarDestroyer(String shpNumber, String shpName) {
		this.ShpNumber = shpNumber;
		this.ShpName = shpName;
	}

	public String getShpNumber() {
		return ShpNumber;
	}

	public void setShpNumber(String shpNumber) {
		ShpNumber = shpNumber;
	}

	public String getShpType() {
		return ShpType;
	}

	public void setShpType(String shpType) {
		ShpType = shpType;
	}

	public String getShpName() {
		return ShpName;
	}

	public void setShpName(String shpName) {
		ShpName = shpName;
	}

	public String getShpClass() {
		return ShpClass;
	}

	public void setShpClass(String shpClass) {
		ShpClass = shpClass;
	}

	public int getShpCrew() {
		return ShpCrew;
	}

	public void setShpCrew(int shpCrew) {
		ShpCrew = shpCrew;
	}

	public Hull getShpHulls() {
		return ShpHulls;
	}

	public void setShpHulls(Hull shpHulls) {
		ShpHulls = shpHulls;
	}

	public Deck getShpDecks() {
		return ShpDecks;
	}

	public void setShpDecks(Deck shpDecks) {
		ShpDecks = shpDecks;
	}

	public Engine getShpEngines() {
		return ShpEngines;
	}

	public void setShpEngines(Engine shpEngines) {
		ShpEngines = shpEngines;
	}

	public SBay getStarboardBay() {
		return StarboardBay;
	}

	public void setStarboardBay(SBay starboardBay) {
		StarboardBay = starboardBay;
	}

	public PBay getPortBay() {
		return PortBay;
	}

	public void setPortBay(PBay portBay) {
		PortBay = portBay;
	}

	public FBay getForwardBay() {
		return ForwardBay;
	}

	public void setForwardBay(FBay forwardBay) {
		ForwardBay = forwardBay;
	}

	public void displayInfo() {
		System.out.println("________Ship Specifications________");
		System.out.println("Ship Number: " + this.getShpNumber() + "    Ship Type: " + this.getShpType() + "         Ship Name: "
				+ this.getShpName() + "     Ship Class: " + this.getShpClass() + "  Ship Crew: " + this.getShpCrew());
		this.getShpHulls().displayHullSpecs();
		this.getShpDecks().displayDeckSpecs();
		this.getShpEngines().displayEngineSpecs();
		this.getStarboardBay().displayBayInfo();
		this.getForwardBay().displayBayInfo();
		this.getPortBay().displayBayInfo();
	}


}
