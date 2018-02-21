package Chapter6;

public class FieldCar2Example {
	//간략화
	public static void main(String[] args) {
		FieldCar2 car = new FieldCar2();
		
		for(int i=1; i<=10; i++) {
			int pro = car.run();
			if(pro != 0) {
				System.out.println(car.tires[pro-1].location + "교체");
				car.tires[pro-1] = new FieldHankookTire(car.tires[pro-1].location, 15);
			}
			System.out.println("-------------------");
		}

	}

}
