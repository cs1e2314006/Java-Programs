package demoAccessorMutator;

public class AccMutDemo {
	int a,b;
	int sum;
	 void add(int a,int b) {
		this.a=a;
		this.b=b;
		sum=this.a+this.b;
//		System.out.println(sum);
	}
	public static void main(String[] args) {
		AccMutDemo m1= new AccMutDemo();
		m1.add(10, 10);//correct way to sum two values 
		System.out.println(m1.sum);// not correct way access result
		/*
		 * amd.a=10,amd.b=10;
		 * amd.sum=amd.a+amd.b
		 * above code does not following encapsulation
		 * */
		AccMutDemo1 m2=new AccMutDemo1();
		m2.add(10, 40);
		System.out.println(m2.getsum());
	}
}
