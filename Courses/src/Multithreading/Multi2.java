package Multithreading;
// Another way to multi threading
public class Multi2 extends Thread{
	public void run() {
		for (int i=1;i<=10;i++)
			System.out.println("Overrided Run Method");
	}
	
	public static void main(String[] args) {
		Multi2 m1= new Multi2();
		m1.start();
		int k=10;
		while(k!=0)
		{
			System.out.println("Main's Method");
			k--;
		}
	}
}
