package Chapter12;

public interface Storage<T> {
	//제네릭 인터페이스
	public void add(T item, int index);
	public T get(int index);
}
