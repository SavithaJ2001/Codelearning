package Inheritence;

class Animals //parent class
{
void eat() {
	System.out.println("Eating");
}
}
 class Dog extends Animals {//subclass
	void bark()
	{
		System.out.println("barking");
	}
 }
	class Babydog extends Dog{
		void weep() {
			System.out.println("Weeping");}
	}
	class Multilevel {
 public static void main(String[] args) {
		Babydog d1= new Babydog();
		d1.eat();
		d1.bark();
		d1.weep();
		
		// TODO Auto-generated method stub

	}
	}






