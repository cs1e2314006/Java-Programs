package LambdaExpression;



interface Lambda2{
	public void  display();
}
interface Lambda3{
	public int check(int a, int b);
}
interface Lambda4{
	public void prints(String a);
}
class Method{
	public static void print() {
		System.out.println("Hello");
	}
}
class Method2{
	public int adds(int a,int b) {
		return a+b;
	}
}
class Method3{
	public Method3(String i) {
		System.out.println(i);
	}
}
public class MethodReference {
	public static void main(String[] args) {
		Lambda2 l1=Method::print;//Assigning the static method of another class to the
		// display method of our interface
		//It will automatically handle the parameter to pass
		l1.display();
		
		// If you want to use non static method then you have to make object of it
		Method2 method2=new Method2();
		Lambda3 l2=method2::adds;
		int a= l2.check(10, 30);
		System.out.println(a);
//		Lambda2 lambda2=System::println("hello");
		
		// we can also assign constructor of a class to a variable
		Lambda4 l3=Method3::new;
		l3.prints("It is using constructor");
		
	}
	
}
