package ferrency.FACTORY;

import java.util.ArrayList;

import ferrency.DROID.AstromechDroid;

public abstract class DroidFactory {

	private String factoryID;
	private ArrayList<AstromechDroid> droidStorage;
	
	public DroidFactory(String factoryID) {
		this.factoryID = factoryID;
	}

	public String getFactoryID() {
		return factoryID;
	}

	public void setFactoryID(String factoryID) {
		this.factoryID = factoryID;
	}

	public ArrayList<AstromechDroid> getDroidStorage() {
		return droidStorage;
	}

	public void setDroidStorage(ArrayList<AstromechDroid> droidStorage) {
		this.droidStorage = droidStorage;
	}
	
	public abstract boolean buildDroids(int count);
	
	public abstract void displayAllDroids();
}
