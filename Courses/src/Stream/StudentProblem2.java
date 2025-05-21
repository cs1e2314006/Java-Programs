package Stream;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
//import java.util.Scanner;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

@SuppressWarnings("serial")
class Customer implements Serializable{
	String name;
	String phone;
	String  CID;
	static int count=0;// will be used to assign unique id for every customer

	public Customer() {}
	Customer(String name,String phone){
		this.name=name;
		this.phone=phone;
		count++; // every time the constructor called or object made , count will be increased
		this.CID="Customer "+count;
	}
	public  String toString() {
		return "Id:- "+CID +"\nName:- "+name+"\nphone:- "+phone;
	}
}

public class StudentProblem2 {
	
	static void write() throws Exception {
		Customer c1=new Customer("Faizan","+911234343");
		Customer c2=new Customer("Rehan","+914545487");
		Customer list2[]= {c1,c2, new Customer("Alex","+917658432"),new Customer("Alice","+327658432")};
		
		FileOutputStream f7=new FileOutputStream("Student7.txt");
		ObjectOutputStream o7=new ObjectOutputStream(f7);
		o7.writeInt(list2.length);
		for(Customer a:list2) {
			o7.writeObject(a);
	}
		o7.close();
	}
	
	static void read() throws Exception{
		FileInputStream f8=new FileInputStream("Student7.txt");
		ObjectInputStream o8=new ObjectInputStream(f8);
		int size= o8.readInt();
		List<Customer>list=new ArrayList<Customer>();
		while(size-->0) {
			list.add((Customer)o8.readObject());
		}
		for(Customer x:list)
			System.out.println(x);
//		Scanner scanner=new Scanner(System.in);
//		while (true) {
//			String check =scanner.next();
//			for(Customer x: list) {
//				if (check.equalsIgnoreCase(x.name)) {
//
//					System.out.println(x);
//				}
//			}
//			
//		}
		o8.close();
	}
	
	public static void main(String[] args) throws Exception{
		write();
		read();
		
	}
	
			
	}

