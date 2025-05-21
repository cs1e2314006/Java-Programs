package Generic;

public class Generic1 {

@SuppressWarnings("rawtypes")
public static void main(String[] args) {
	// you can assign refrence of object class to any other class 
	// it will not give error in compile time
	// we can convert any one class object to other class object
	// due to this there is no type safety in object class
	Object object=new String("Hello");
//	object=new Integer(11);
//	String string=(String)object;
	
	Object arr[]=new String[3];
	arr[0]="Hii";
	arr[1]="hello";
	arr[2]=2;
	// look in the above code we have stored integer as well as sttring in the same arr
	// and it not showing any error but in runtime it will generate error
	// so programmer have to take care of that
	GenericSolution <String>s1=new GenericSolution<>();
	s1.set("Hello");
	s1.set("World");
	//s1.set(100);// now it is showing error at compile time that was redundant without using generic
	s1.display();
	GenericSolution <Integer>s2=new GenericSolution<>();
	s2.set(100);
	s2.set(11);
//	s2.set("hello"); it is also generating ar error
	GenericSolution s3=new GenericSolution();
	s3.set("faizan");
	s3.set("alex");
	s3.set(10);
	s3.display();
	System.out.println("hello");
// above code does not generating error neither on compile nor runtime

}
}

