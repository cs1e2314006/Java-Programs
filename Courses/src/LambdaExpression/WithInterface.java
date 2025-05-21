package LambdaExpression;

interface Lambda{
	void display();
}

interface Calculation{
	int add(int a,int b);
}

class Mylambda implements Lambda{

	public void display() {
		System.out.println("Hello world");
	}
	
}

public class WithInterface {
	public static void main(String[] args) {
		// old method
		Mylambda a1=new Mylambda();
		a1.display();
		// Lambda Expression
		Lambda a2=()->{System.out.println("From Main");};
		a2.display();
		// Lambda expression with parameter
		Calculation c1=(a,b)->a+b;
		int c=c1.add(10, 20);
		System.out.println(c);
	}
}
