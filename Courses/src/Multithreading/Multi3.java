package Multithreading;
class ThreadTest extends Thread{
	public ThreadTest(String name) {
		super(name);
	}
	public void run() {
		System.out.println("it is thread");
		for (int i=1;i<=10;i++)
		{
			for (int j=1;j<=10;j++) {
				if (i==1)
					System.out.print("F ");
				else if (j==1)
					System.out.print("F ");
				else if (i==5 && j<=6)
					System.out.print("F ");
				else
					System.out.print("  ");
				try {
					Thread.sleep(100);
				} catch (Exception e) {
					System.out.println("an error occured");
				}
			}
			System.out.println();
		}
	}
}
public class Multi3 {
	
public static void main(String[] args) {
	ThreadTest e= new ThreadTest("first thread");
	System.out.println(e.getName());
	System.out.println(e.getClass());
	e.start();
//	e.interrupt();
	
}		
}
