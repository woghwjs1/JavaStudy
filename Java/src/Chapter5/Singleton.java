package Chapter5;

public class Singleton {
	//ΩÃ±€≈Ê
	private static Singleton singleton = new Singleton();
	
	private Singleton() {}
	
	static Singleton getInstance() {
		return singleton;
	}
}
