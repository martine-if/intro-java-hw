package ferrency.FACTORY;

public class R3Factory extends DroidFactory{

	public R3Factory(String factoryID) {
		super(factoryID);
	}

	@Override
	public boolean buildDroids(int count) {
		return false;
	}

	@Override
	public void displayAllDroids() {
		
	}

}
