package string;

public class StringPractice {
	public static void main(String[] args) {
		String s1=new String();
		System.out.println(s1);
		String s2=new String("Hello");
		System.out.println(s2);
		char []c= {'f','a','i','z','a','n'};
		String s3=new String(c);
		System.out.println(s3);
		String s5="Bye";
		System.out.println(s5);
		String s4=new String("Bye");
		System.out.println(s4);
		String s6=s2;
		System.out.println(s6);
		// hashcodes
		System.out.println("s1- "+s1.hashCode());
		System.out.println("s2- "+s2.hashCode());
		System.out.println("s3- "+s3.hashCode());
		System.out.println("s4- "+s4.hashCode());
		System.out.println("s5- "+s5.hashCode());
		System.out.println("s6- "+s6.hashCode());
		
		//comparison
		System.out.println(s2==s6);
		System.out.println(s5==s4);
		


		
	}
}
