package ferrency.BAY;

import java.util.ArrayList;

import ferrency.ENUMS.TieFighter;

public class SBay extends FighterBay{
	private int Capacity = 36;

	public SBay(String bayName, String bayID) {
		super(bayName, bayID);
		this.setBayType("Tie Fighter S");
		ArrayList<TieFighter> slots = new ArrayList<TieFighter>();
		for(int i=0;i<this.getCapacity();i++) {
			slots.add(TieFighter.TieFighter_H);
		}
		this.setSlots(slots);
	}

	public int getCapacity() {
		return Capacity;
	}

	public void setCapacity(int capacity) {
		Capacity = capacity;
	}

	@Override
	public void displayTieFighters() {
		for(TieFighter i:this.getSlots()) {
			i.display();
		}

	}

	@Override
	public void displayBayInfo() {
		System.out.println("________Fighter Bay Specifications________");
		System.out.println("Starboard Fighter Bay ID: " + this.getBayID());
		System.out.println(this.getBayName());
		System.out.println(this.getBayID());
		System.out.println(this.getBayType().substring(0,11));
		System.out.println("Fighter Capacity: " + this.getCapacity());
		System.out.println();

	}

}
