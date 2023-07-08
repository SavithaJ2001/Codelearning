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
		public void Dance() {
			System.out.println("Dancing");}
	}
	class BabyDog extends Dog {//subclass
		void Weep()
		{
			System.out.println("Weeping");
		}
		void Dance() {
			System.out.println("Dancing");
		}
	 }
	class Hybrid  {
 public static void main(String[] args) {
	 BabyDog  p= new BabyDog ();
		p.eat();
		p.Weep();
		p.Dance();
		p.bark(); 
		
	}
	}

 


