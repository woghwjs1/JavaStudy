package Chapter12;

public class ChildProduct<T, M, C> extends Product<T, M> {
	//자식 제네릭 클래스
	private C company;
	public C getCompany() {return this.company;}
	public void setCompany(C company) {this.company = company;}
}
