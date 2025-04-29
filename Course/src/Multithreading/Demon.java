package Multithreading;

//import jdk.internal.icu.util.CodePointTrie.Fast16;

class Threads extends Thread{
	public void run() {
		for (int i=1;i<=10;i++)
			System.out.println("Overrided Run Method");
	}
}
	
public class Demon {
	public static void main(String[] args) throws InterruptedException {
		Threads t1=new Threads();
		t1.setDaemon(true);// this will make thread terminate as soon as main method terminate
		t1.start();
		// to again start the thread we have to join it with main again
		Thread m1 = new Thread();
		m1.join();
		
	// there are also some more methods like "yield " which will reduce the priority of that
//thread in which it is used then the thread without yield will get more time for execution
	}

}
