package ferrency.FACTORY;

import java.util.ArrayList;

import ferrency.ISD.*;

public class ISD1_Factory extends ISDFactory {

	public ISD1_Factory(String name) {
		super(name);
		this.setBuildType("Imperial I");
	}

	//ISD I Serial Numbers start with ISD-83 and increment by 1 for each one built ISD-83, ISD-84, etc.
	//ISD I Names start with SD-000_I and increment by 1 for each one built SD-001_I, SD-002_I, etc.
	@Override
	public boolean buildISDs(int count) {
		this.setDryDock(new ArrayList<StarDestroyer>());
		for(int i = 0; i<count; i++) {
			this.getDryDock().add(new Imperial_I("ISD-" + (83+i),"SD-00"+ i + "_I"));
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
