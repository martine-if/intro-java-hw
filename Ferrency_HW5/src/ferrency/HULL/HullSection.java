package ferrency.HULL;

public abstract class HullSection {

	private String HullType;
	private String StarDestroyerType;
	private int Length;
	private int Height;
	private int Width;
	private int Weight;
	
	public HullSection(String hullType, String starDestroyerType, int length, int height, int width, int weight) {
		this.HullType = hullType;
		this.StarDestroyerType = starDestroyerType;
		this.Length = length;
		this.Height = height;
		this.Width = width;
		this.Weight = weight;
	}

	public String getHullType() {
		return HullType;
	}

	public void setHullType(String hullType) {
		HullType = hullType;
	}

	public String getStarDestroyerType() {
		return StarDestroyerType;
	}

	public void setStarDestroyerType(String starDestroyerType) {
		StarDestroyerType = starDestroyerType;
	}

	public int getLength() {
		return Length;
	}

	public void setLength(int length) {
		Length = length;
	}

	public int getHeight() {
		return Height;
	}

	public void setHeight(int height) {
		Height = height;
	}

	public int getWidth() {
		return Width;
	}

	public void setWidth(int width) {
		Width = width;
	}

	public int getWeight() {
		return Weight;
	}

	public void setWeight(int weight) {
		Weight = weight;
	}
	
	public String HullInfo() {
		return "";
	}

	@Override
	public String toString() {
		return "HullSection [HullType=" + HullType + ", StarDestroyerType=" + StarDestroyerType + ", Length=" + Length
				+ ", Height=" + Height + ", Width=" + Width + ", Weight=" + Weight + "]";
	}

	
}
