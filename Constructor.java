package basic;

public class Constructor {
	
		int rno;
		String name;
		public Constructor() {
			rno=15;
			name="Gopal";	
		}
		public Constructor(int rno,String nm) {
			this.rno=rno;
			name=nm;
		}
		public Constructor (String nm) {
			rno=34;
			name=nm;
		}
		//copy Constructor
		public Constructor(Constructor s) {
			rno=s.rno;
			name=s.name;
		}
		void display() {
			System.out.println("Student Rollno: "+rno);
			System.out.println("Student Name: "+name);	
		}
		public static void main(String[] args) {
			Constructor s3=new Constructor(17,"pujitha");//parameterized
			s3.display();
			Constructor s=new Constructor();//object
			s.rno=1;
			s.name="Pooja";
			s.display();
			Constructor s1=new Constructor();
			s1.rno=10;
			s1.name="Priya";
			s1.display();
			Constructor s2=new Constructor();//default
			s2.display();
			Constructor s4=new Constructor("Jiya");
			s4.display();
			Constructor s5=new Constructor(s);
			s5.display();

		}

}
