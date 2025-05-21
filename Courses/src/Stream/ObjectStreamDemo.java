package Stream;


import java.io.*;

@SuppressWarnings("serial")
class Student2 implements Serializable
{
   // if you dont want to serialize any member make it static or transient
	private int rollno;
    private String name;
    private float avg;
    private String dept;
    public static int Data=10;
    public transient int t;
    
    public Student2()
    {
        
    }
    public Student2(int r,String n,float a,String d)
    {
        rollno=r;
        name=n;
        avg=a;
        dept=d;
        Data=500;// they will be initialized by constructor but on deserializing or fetching
        // from file their value will change to initial value
        t=500;
    }
    
    public String toString() //overriding the tostring method of java.lang class
    // as it is automatically called when you try to print object
    {
        return "\nStudent Details\n"+
                "\nRoll "+rollno+
                "\nName "+name+
                "\nAverage "+avg+
                "\nDept "+dept+
                "\nData "+Data+
                "\nTransient "+t+"\n";
    }
    
}

public class ObjectStreamDemo 
{
    public static void main(String[] args) throws Exception
    {
        FileOutputStream fos=new FileOutputStream("Student3.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        
        Student2 s=new Student2(10,"John",89.9f,"CSE");
        
        oos.writeObject(s);
        
        fos.close();
        oos.close();
        FileInputStream fis=new FileInputStream("Student3.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);
        Student2 student2= (Student2)ois.readObject();
        System.out.println(student2);
        ois.close();
        
        
    }
}
