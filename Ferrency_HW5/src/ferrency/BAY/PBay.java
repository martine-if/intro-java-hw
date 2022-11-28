package ferrency.BAY;

import java.util.ArrayList;

import ferrency.ENUMS.TieFighter;

public class PBay extends FighterBay {

	private int Capacity = 48;

	public PBay(String bayName, String bayID) {
		super(bayName, bayID);
		this.setBayType("Tie Fighter P");
		ArrayList<TieFighter> slots = new ArrayList<TieFighter>();
		for(int i=0;i<this.getCapacity();i++) {
			slots.add(TieFighter.TieFighter_I);
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
		System.out.println("Port Fighter Bay ID: " + this.getBayID());
		System.out.println(this.getBayName());
		System.out.println(this.getBayID());
		System.out.println(this.getBayType().substring(0,11));
		System.out.println("Fighter Capacity: " + this.getCapacity());

	}

}
