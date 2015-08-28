

public class Cat extends Animal{
	public Cat(){
		super();
	}
	
	@Override
	public void sleep(){
		System.out.println("a cat sleeps.");
	}
	
	@Override
	public void eat(){
		System.out.println("a cat eats.");
	}
}