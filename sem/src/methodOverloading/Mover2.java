package methodOverloading;

public class Mover2 {
	public static void main(String[] args) {
		Mover1 objMover1= new Mover1();
		System.out.println(objMover1.add(10, 20));
		System.out.println(objMover1.add(10,20,30));
		System.out.println(objMover1.add(33.5f, 88.7f));
//		System.out.println(objMover1.add());
	}

}
