package basic;

public class StudentEx {
	int rno;
	String name;
	public StudentEx(){//default constructor 
	rno=1234;
	name="Sharly";
	}
	
	public StudentEx(int rno,String Sharly) {//parameterized constructor{
		this.rno=rno;
		name=Sharly;
	}
	public StudentEx(StudentEx s) { //copy constructor
		rno=s.rno;
		name=s.name;
		
	}
	
	void display() {
		System.out.println("Student Roll Number:"+rno);
		System.out.println("Student Name:"+name);
	}
	public static void main(String[] args) {
	StudentEx sb =new StudentEx(1234,"abcd");
	sb.display();
	StudentEx sb1 =new StudentEx(5678,"efgh");
	sb1.display();
	StudentEx sb2 =new StudentEx(sb);
	sb2.display();
	

	
	

	
		// TODO Auto-generated method stub

	}

}
