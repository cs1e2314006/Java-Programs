package methodDemo;

public class Starter {
	public static void main(String[] args) {
		MethodTypeDemo m1=new MethodTypeDemo();
		MethodTypeDemo1 m2=new MethodTypeDemo1();
		m1.a=20;
		m1.b=40;
		m2.MethodCall(14,16);
		m2.MethodCallByRefrence(m1);
	}
}
