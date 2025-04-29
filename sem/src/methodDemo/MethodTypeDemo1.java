package methodDemo;

public class MethodTypeDemo1 {
	
	void MethodCall(int a,int b) {
		System.out.println(a+b);
	}
	void MethodCallByRefrence(MethodTypeDemo mtd) {
		System.out.println(mtd.a + mtd.b);
	}
}
