package DynamicMethodDispatch;

public class Derived extends Base{
	int var1=10;
	int var2=30;
//	int var4;
	void add() {
		System.out.println(var1+var2);
	}
}
