package Stream;
// in this we are doing the same thing as we have done synchronization of multithreading
// piped stream is just like the connection of pipe from one side data is coming and 
// they both are joined by pipe and data is going to another side

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

// here we are making producer and consumer thread extended class as usual producer is producing data and 
// consumer is consuming but in a synchronized manner

class Producer extends Thread{
	// producer will write so it needs  an output stream
	OutputStream os;
	public Producer(OutputStream o) {
		this.os=o;
	}
	//as usual for thread we have to override run method
	public void run() {
		int count=0;
		while(true) {
			try {
				os.write(count);
				os.flush();// it is like flushing the pipe so the chunk of data is not collected
				System.out.println("Producer "+count);
				System.out.flush();
				count++;
				Thread.sleep(10); // to keep the value of conumer and producer synchronized 
				// as without sleep the differnce in values of both is very large
				// so we need to shut down process after every execution
			}catch (IOException e) {}
			catch (InterruptedException e) {}
			catch(IllegalArgumentException e) {}
		}
	}
}

class Consumer extends Thread{
	// Consumer will consume so it needs inputstream
	InputStream is;
	public Consumer(InputStream input){
		this.is=input;
	}
	
	public void run() {
		int x;
		while(true) {
			try {
				x=is.read();
				System.out.println("Consumer "+ x);
				System.out.flush();
				 
				Thread.sleep(10); // to keep the value of conumer and producer 
				// as without sleep the differnce in values of both is very large
				// so we need to shut down process after every execution
			}catch (IOException e) {}
			catch (InterruptedException e) {}
			catch(IllegalArgumentException e) {}
		}
	}
	
}
public class PipedStream {
	public static void main(String[] args) {
		PipedInputStream pis=new PipedInputStream();
		PipedOutputStream pos= new PipedOutputStream();
		
		try {
			pos.connect(pis);
		}catch (IOException e) {e.printStackTrace();}
		
		Producer p1=new Producer(pos);
		Consumer c1=new Consumer(pis);
		p1.start();
		c1.start();
	}
}
