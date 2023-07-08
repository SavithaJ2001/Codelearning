package Inheritence;
class Student{
	String name="Savitha";
	
	void display() {
		System.out.println(name);	}
	
}
//subclass
class Developer extends Student{
	String role="Full Stack";
	
	void displayRole() {
		System.out.println(role);
	}
}
public class SingleInheritence {
public static void main(String[]args){
	Developer d1=new Developer();
	d1.display();
	d1.displayRole();
}
}
