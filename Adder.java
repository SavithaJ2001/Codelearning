package basic;

//public class Adder {//with same datatype 
//	static int add(int a,int b) {
//		return a+b;
//	}
//static int add(int a,int b,int c) {
//	return a+b+c;
//}
//public class MethodOverloading{
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//System.out.println(Adder.add(10,20));
//System.out.println(Adder.add(10,20,30));
//	}
//
//}
//}
public class Adder {//with different datatype 
	static int add(int a,int b) {
		return a+b;
	}
static int add(double a,double b) {
	return a+b;
}
public class MethodOverloading{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(Adder.add(10,20));
System.out.println(Adder.add(10.5,20.5));
	}

}
}
