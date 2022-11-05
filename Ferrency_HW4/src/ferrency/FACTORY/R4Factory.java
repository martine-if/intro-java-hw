package ferrency.FACTORY;

public class R4Factory extends DroidFactory{
	public R4Factory(String factoryID) {
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
