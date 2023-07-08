package Inheritence;
class Animal //parent class
{
void eat() {
	System.out.println("Eating");
}
}
 class Dog extends Animal {//subclass
	void bark()
	{
		System.out.println("barking");
	}
 }
	class Peacock extends Animal{
		void Dance() {
			System.out.println("Dancing");}
	
		public void bark() {
			System.out.println("Barking");}
			
		}
	

	class Hierarchical  {
 public static void main(String[] args) {
		 Peacock p= new Peacock();
		p.eat();
		p.Dance();
		p.bark(); 
		
	}
	}





