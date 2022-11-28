package ferrency.BAY;

import java.util.ArrayList;

import ferrency.ENUMS.TieFighter;

public abstract class FighterBay extends Bay{

	ArrayList<TieFighter> Slots;
	
	public FighterBay(String bayName, String bayID) {
		super(bayName, bayID, "Tie Fighter");
		
	}

	public ArrayList<TieFighter> getSlots() {
		return Slots;
	}

	public void setSlots(ArrayList<TieFighter> slots) {
		Slots = slots;
	}
	
	public abstract void displayTieFighters();
	
}
