package AbstractClasses;

public class AbstractExample {
	
	abstract class AbstractDemo{
		
		abstract void abc();
		abstract void sub();
		abstract void mul();
		
	}
	
	public class AbImplement extends AbstractDemo{
		void abc() {
			System.out.println("Adding");
		}
		void sub() {
			System.out.println("Substracting");

		}
		void mul() {
			System.out.println("Multiplying");

		}
	}
	
	public static void  main(String[] args) {
		
		 AbstractExample outer = new AbstractExample();

	        // Use the outer class  to instantiate the inner class
	        AbstractExample.AbImplement a1 = outer.new AbImplement();

	        // Call the implemented methods
	        a1.abc();
	        a1.sub();
	        a1.mul();
		
		
	}
}
