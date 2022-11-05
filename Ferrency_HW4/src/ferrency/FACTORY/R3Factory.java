package ferrency.FACTORY;

import java.text.DecimalFormat;
import java.util.ArrayList;

import ferrency.DROID.AstromechDroid;
import ferrency.DROID.R3;

public class R3Factory extends DroidFactory{

	public R3Factory(String factoryID) {
		super(factoryID);
	}

	//Creates the specified number of R3s and adds
	//them to the droidStorage attribute and returns true
	@Override
	public boolean buildDroids(int count) {
		for(int i=0;i<count;i++) {
			this.setDroidStorage(new ArrayList<AstromechDroid>());
			this.getDroidStorage().add(new R3("R3-" + new DecimalFormat("000").format(i)));
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
