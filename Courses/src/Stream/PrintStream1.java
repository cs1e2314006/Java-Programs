package Stream;

import java.io.*;
class Student1{
	int roll;
	String name;
	String Branch;
}

public class PrintStream1 {
	public static void write() throws Exception{
		FileOutputStream fos=new FileOutputStream("test4.txt");
		Student1 s1=new Student1();
		s1.name="faizan";
		s1.Branch="CSE";
		s1.roll=123;

		// for stroring in file we use print stream
		PrintStream	ps= new PrintStream(fos);
		// ps.println(s1);
        ps.println(s1.name);
        ps.println(s1.Branch);
        ps.println(s1.roll);
        ps.close();
		
	}
	public static void read() throws Exception {
		FileInputStream fis=new FileInputStream("test4.txt");
        // we will use buffer reader because filestream read character one by one
        // but we have to read one line at a time and buffereader has that method but stream dont 
        BufferedReader bs=new BufferedReader(new InputStreamReader(fis));
        Student1 s=new Student1();
        s.name=bs.readLine();
        s.Branch=bs.readLine();
        s.roll=Integer.parseInt(bs.readLine());
        bs.close();
        fis.close();
        System.out.println("Name:- "+s.name +"\nRoll:-"+s.roll);
	}
	public static void main(String[] args) throws Exception {
	write();
    read();
}
}
