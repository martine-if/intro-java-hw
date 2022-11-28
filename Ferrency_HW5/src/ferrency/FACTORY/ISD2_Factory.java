package ferrency.FACTORY;

import java.util.ArrayList;

import ferrency.ISD.*;

public class ISD2_Factory extends ISDFactory{
	public ISD2_Factory(String name) {
		super(name);
		this.setBuildType("Imperial II");
	}

	//ISD II Serial Numbers start with ISD-901 and increment by 1 for each one built ISD-901, ISD-902, etc.
	//ISD II Names start with SD-000_II and increment by 1 for each one built SD-001_II, SD-002_II, etc.
	@Override
	public boolean buildISDs(int count) {
		this.setDryDock(new ArrayList<StarDestroyer>());
		for(int i = 0; i<count; i++) {
			this.getDryDock().add(new Imperial_II("ISD-90"+i,"SD-00"+ i + "_II"));
		}
		return false;
	}

	@Override
	public void displayISDs() {
		for(int i=0;i<this.getDryDock().size();i++) {
			this.getDryDock().get(i).displayInfo();
		}
	}
}
