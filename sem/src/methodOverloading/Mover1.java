package methodOverloading;

public class Mover1 {

	int add(int a, int b) {
		System.out.println("from method 1");
		return a + b;
	}
	int add(int a, int b, int c) {
		System.out.println("from method 2");
		
		return a + b + c;
	}
	float add (float a, float b) {
		System.out.println("from method 3");
		return a+b;
	}
	void add() {
		
	}

}
