package demoAccessorMutator;

public class AccMutDemo1 {
	private int a;
	private int b;
	private int sum;
	void add(int a,int b) {
		this.a=a;
		this.b=b;
		sum=this.a+this.b;
	}
	int getsum() {
		return sum;
	}

}
