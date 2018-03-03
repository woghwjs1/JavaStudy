package Chapter12;

public class Product<T, M> {
	//제네릭 클래스
	private T kind;
	private M model;
	
	public T getKind() { return this.kind;  }
	public M getModel(){ return this.model; }
	
	public void setKind(T kind) {this.kind = kind;}
	public void setModel(M model) {this.model = model;}
}
class Tv{}
class Car{}
