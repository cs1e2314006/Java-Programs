package Multithreading;

public class Multi1 {
	class My implements Runnable{
		public void run() {
			int i=10;
			while (i!=0) {

				System.out.println("Hello");
				i--;
			}
		}
	}
	public static void main(String[] args) {
//		My m1= new My();
		Multi1 multi1= new Multi1();
		Multi1.My myobj= multi1.new My();
		Thread t1= new Thread(myobj);
		t1.start();
		System.out.println(t1.getState());// if you dont start thread it shows new state
		int k=10;
		while(k!=0)
		{
			System.out.println("World");
			k--;
		}
		System.out.println(t1.getState());
		System.out.println("priority of thread = "+t1.getPriority());
		
		// another way to create thread by providing anonymous object
		Thread e= new Thread(multi1.new My());
		e.start();
	}
}
