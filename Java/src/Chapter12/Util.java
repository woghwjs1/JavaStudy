package Chapter12;

public class Util {
	//제네릭 메소드
	public static <T> BoxGeneric<T> boxing(T t){
		BoxGeneric<T> box = new BoxGeneric<T>();
		box.set(t);
		return box;
	}
}
