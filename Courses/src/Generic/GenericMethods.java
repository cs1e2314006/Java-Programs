package Generic;

public class GenericMethods {
	@SafeVarargs
	static <T>void display (T... e){
		// this can accept any data type object 
		// here i have used varag but you can also used array
		for(T a:e) {
			System.out.println(a);
		}
	}

	
	
	public static void main(String[] args) {
		display("hi","hello","static");
		display(1,2,3);
		display(new String[]{"String","Object"});
	}

}
