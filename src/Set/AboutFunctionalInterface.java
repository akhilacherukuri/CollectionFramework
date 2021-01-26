package Set;

interface Animal {
	// An Interface that contains exactly one abstract method is known as functional
	// interface. It can have any number of default, static methods but can contain
	// only one abstract method.
	public void cat();

	// Java provides a facility to create default methods inside the interface.
	// Methods which are defined inside the interface and tagged with default are
	// known as default methods. These methods are non-abstract methods.
	public default void dog() {
		System.out.println("bow bow");
	}
	
	public static void sample() {
		System.out.println("static method.....");
	}
}

public class AboutFunctionalInterface implements Animal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AboutFunctionalInterface obj = new AboutFunctionalInterface();
		obj.cat();
		obj.dog();
		Animal.sample();
	}

	@Override
	public void cat() {
		System.out.println("mew mew");

	}

}
