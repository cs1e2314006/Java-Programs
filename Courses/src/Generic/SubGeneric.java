package Generic;
class SuperGeneric<E>{
	@SuppressWarnings("unchecked")
	E[]arr=(E[])new Object[10];
	int length=0;
	void set(E v) {
		arr[length++]=v;
	}
	void display() {
		for(int i=0;i<length;i++)
			System.out.println(arr[i]);
	}

}
class IntegerGeneric extends SuperGeneric<Integer>{
	// sub class who can only accepts integer parameter
}
class StringGeneric extends SuperGeneric<String>{
	// can only accepts String parameter
}
class LikeGeneric<T> extends SuperGeneric<T>{
	// if you are writing generic <T> then then you have two write it on both sub and super class
	
}
public class SubGeneric {
public static void main(String[] args) {
	IntegerGeneric i1=new IntegerGeneric();// in this you dont need to specify argument type
	i1.set(10);
	i1.set(20);
//	i1.set("hello"); it will generate error as you are passing string in it
	StringGeneric s1=new StringGeneric();
	s1.set("Hello");
	s1.set("world");
	
	
}
}
