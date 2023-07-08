package basic;

class NewStatic{
	void addition(int a, int b, int c) {
		System.out.println("the addition of 3 numbers is: "+ (a+b+c));
		
	}
	
	int division(int a, int b){
		return a/b;
	}
		String displayname(String s) {
			return "Welcome "+s;
			
	}
		public static int multiply(int a,int b) {
			return a*b;
			
		}
}


public class StaticMethod {

	public static void main(String[] args) {
	
		NewStatic s=new NewStatic();
		s.addition(2, 3, 4);
		int value=s.division(4, 2);
		System.out.println(value);
		System.out.println(s.displayname("Savitha J"));
		int k=NewStatic.multiply(5,6);
		System.out.println(k);

	}

}