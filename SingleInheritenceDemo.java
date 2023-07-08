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

class SingleInheritence{
	public static void main(String[] args) {
		Dog d1= new Dog();
		d1.eat();
		d1.bark();
		
		// TODO Auto-generated method stub

	}



}
