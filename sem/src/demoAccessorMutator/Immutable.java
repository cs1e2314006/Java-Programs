package demoAccessorMutator;


public class Immutable {
	private long roll;
	private String name;
	private float percentage;
	// all get methods are called accessor
	// all sets are mutator
	public Immutable(String name,long roll,float percentage) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.percentage=percentage;
		this.roll=roll;
	}
	
	public long getRoll() {
		return roll;
	}
	
	public String getName() {
		return name;
	}
	
	public float getPercentage() {
		return percentage;
	}
	
	public static void main(String[] args) {
	Immutable i1=new Immutable("faizan",2301640100253l,98.9f);
	Immutable i2=new Immutable("faizan",2301640100253l,98.9f);

	System.out.println(i1.getName());
	System.out.println(i1.getRoll());
	System.out.println(i1.getPercentage());
	System.out.println(i1);
	System.out.println(i2);
	}
	
}
