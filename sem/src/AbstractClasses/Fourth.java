package AbstractClasses;

public class Fourth extends Third{
	
//		void method1() {
//			System.out.println("Method1 from FourthClass");
//		}
//		void method2() {
//			System.out.println("Method2 from FourthClass");
//		}
//		void method3() {
//			System.out.println("Method3 from FourthClass");
//		}
		void method4() {
			System.out.println("Method4 from FourthClass");
		}
		void method5() {
			System.out.println("Method5 from FourthClass");
		}

	public static void main(String[] args) {
		Fourth a1=new Fourth();
		a1.method1();
		SecondClass a2=new Fourth();
		a2.method2();
		Fourth a3=new Fourth();
		a3.method3();
	}
}
