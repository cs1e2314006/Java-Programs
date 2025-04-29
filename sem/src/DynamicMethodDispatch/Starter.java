package DynamicMethodDispatch;

public class Starter {
	public static void main(String[] args) {
		Base c1=new Derived();
		c1.add();
		System.out.println(c1.var1+ " " + c1.var2 +" ");
	}
}
