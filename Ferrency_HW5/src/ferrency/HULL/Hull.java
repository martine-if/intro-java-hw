package ferrency.HULL;

public class Hull {

	private String IDNumber;
	private FwdHullSection SectionFWD;
	private AftHullSection SectionAFT;
	
	public Hull(String iDNumber, String StarDestroyerType) {
		this.IDNumber = iDNumber;
	}

	public String getIDNumber() {
		return IDNumber;
	}

	public void setIDNumber(String iDNumber) {
		IDNumber = iDNumber;
	}

	public FwdHullSection getSectionFWD() {
		return SectionFWD;
	}

	public void setSectionFWD(FwdHullSection sectionFWD) {
		SectionFWD = sectionFWD;
	}

	public AftHullSection getSectionAFT() {
		return SectionAFT;
	}

	public void setSectionAFT(AftHullSection sectionAFT) {
		SectionAFT = sectionAFT;
	}
	
	public void displayHullSpecs() {
		System.out.println("________Hull Specifications________");
		System.out.println("HULL: " + this.getIDNumber());
		System.out.println(this.getSectionFWD().toString());
		System.out.println(this.getSectionAFT().toString());
	}

	
	
}
