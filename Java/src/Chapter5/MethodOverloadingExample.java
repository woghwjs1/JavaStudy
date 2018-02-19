package Chapter5;

public class MethodOverloadingExample {
	//메소드 오버로딩
	public static void main(String[] args) {
		MethodOverloading method = new MethodOverloading();
		
		//정사각형 넓이
		double result1 = method.areaRectangle(10.5);
		System.out.println("정사각형 넓이 : " + result1);
		
		//직사각형 넓이
		double result2 = method.areaRectangle(10.5, 12.1);
		System.out.println("직사각형 넓이 : " + result2);

	}

}
