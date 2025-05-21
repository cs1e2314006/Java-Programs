package demoAccessorMutator;

// all members are private
// have only getter but no setter
// check if hash code is already availabe then do not create new object
public class Immutablitliy {
	private long roll;
	private String name;
	private float percentage;
	// all get methods are called accessor
	// all settters are mutator
	public Immutablitliy(String name,long roll,float percentage) {
		this.name=name;
		this.percentage=percentage;
		this.roll=roll;
	}
	
	
	public long getRoll() {
		return this.roll;
	}
	
	public String getName() {
		return this.name;
	}
	
	public float getPercentage() {
		return this.percentage;
	}
	
	public static void main(String[] args) {
	Immutablitliy i1=new Immutablitliy("faizan",2301640100253l,98.9f);
	Immutablitliy i2=new Immutablitliy("faizan",2301640100253l,98.9f);

	System.out.println(i1.getName());
	System.out.println(i1.getRoll());
	System.out.println(i1.getPercentage());
	System.out.println(i1.equals(i2));
	System.out.println(i2);
	}
	
}
