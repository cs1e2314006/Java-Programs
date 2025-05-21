package Generic;

class GenericSolution<T>
// if you do not specify parameter in <> then there is no usage of generic as it again starts to 
// act like the previous object class and starts to store values of multiple data type
// and this will not generate error neither on compile nor runtime
{
	@SuppressWarnings("unchecked")
	T[]arr=(T[])new Object[10];
	int length=0;
	void set(T v) {
		arr[length++]=v;
	}
	void display() {
		for(int i=0;i<length;i++)
			System.out.println(arr[i]);
	}
}
