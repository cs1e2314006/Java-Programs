package Multithreading;

class Mydata
{
    int value;
    boolean flag=true;
    
    synchronized public void set(int v)
    {
        while(flag!=true)
            try {wait();}catch(Exception e){}
        
        value=v;
        flag=false;
        notify();
    }
    
    synchronized public int get()
    {
        int x=0;
        while(flag!=false)
            try {wait();}catch(Exception e){}
        
        
        x=value;
        flag=true;
        notify();
        
        return x;            
    }
}

class Producer extends Thread
{
    Mydata data;
    
    public Producer(Mydata d)
    {
        data=d;
    }
    public void run()
    {
        int count=1;
        while(true)
        {
            data.set(count);
            System.out.println("Producer "+count);
            try {
				sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            count++;
        }
    }
}

class Consumer extends Thread
{
    Mydata data;
    
    public Consumer(Mydata d)
    {
        data=d;
    }
    public void run()
    {
        int value;
        while(true)
        {
            value=data.get();
            System.out.println("Consumer "+value);
            try {
				sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
    }
}

public class InterProcess 
{
    public static void main(String[] args) 
    {
        Mydata data=new Mydata();
        
        Producer p=new Producer(data);
        Consumer c=new Consumer(data);
        
        p.start();
        c.start();
        
    }
}