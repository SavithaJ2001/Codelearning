package basic;

public class ConstructorOverloading {
	static int id;
	static String name;
	static int age;
ConstructorOverloading(int i,String nm){
id=i;
name=nm;
}ConstructorOverloading(int i,String nm,int a){
	id=i;
	name=nm;
	age=a;
}
void display1() {
	System.out.println(id+" "+name);
	
}
void display2() {	
	System.out.println(id+" "+name+" "+age);
}
public static void main(String [] args) 
{
ConstructorOverloading s1 =new ConstructorOverloading(1,"savitha");
s1.display1();
ConstructorOverloading s2 =new ConstructorOverloading(2,"tavitha",22);
s2.display2();
}
	
}

