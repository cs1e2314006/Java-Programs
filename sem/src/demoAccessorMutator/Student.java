package demoAccessorMutator;

public class Student {
	private long roll;
	private String nameString;
	// all get methods are called accessor
	// all sets are mutator
	public long getRoll() {
		return roll;
	}
	public void setRoll(long roll) {
		this.roll = roll;
	}
	public String getNameString() {
		return nameString;
	}
	public void setNameString(String nameString) {
		this.nameString = nameString;
	}
	public static void main(String[] args) {
		Student s1=new Student();
		s1.setNameString("faizan");
		s1.setRoll(12346758l);
		System.out.println(s1.getNameString());
		System.out.println(s1.getRoll());
	}

}
