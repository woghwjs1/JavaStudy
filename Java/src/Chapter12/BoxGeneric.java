package Chapter12;

public class BoxGeneric<T> {
	//제네릭 타입
	private T t;
	public T get() {return t;}
	public void set(T t) { this.t = t; }
}
