package dog_class;

public class Dog {
	int size;
	String breed;
	String name;
	
	void bark() {
		System.out.println("Bark! Bark! Ruff! Ruff!");
	}
	
	void whoAmI() {
		System.out.println("Hi, my name's "+ name+"!");
		System.out.println("I am a "+Integer.toString(size)+" lb. " +breed+".");
		System.out.println("Boy, do I love you!");
	}
}
