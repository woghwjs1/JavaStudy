package Chapter12;

public class Util {
	//���׸� �޼ҵ�
	public static <T> BoxGeneric<T> boxing(T t){
		BoxGeneric<T> box = new BoxGeneric<T>();
		box.set(t);
		return box;
	}
}
