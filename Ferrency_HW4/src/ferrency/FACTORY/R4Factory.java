package ferrency.FACTORY;

import java.util.ArrayList;

import ferrency.DROID.AstromechDroid;
import ferrency.DROID.R4;

public class R4Factory extends DroidFactory{
	public R4Factory(String factoryID) {
		super(factoryID);
	}

	@Override
	public boolean buildDroids(int count) {
		for(int i=0;i<count;i++) {
			this.setDroidStorage(new ArrayList<AstromechDroid>());
			this.getDroidStorage().add(new R4("R4-" + String.format("%03d", i)));
		}
		return true;
	}

	@Override
	public void displayAllDroids() {
		for(int i=0;i<this.getDroidStorage().size();i++) {
			this.getDroidStorage().get(i).displayDroid();
		}
	}
}
