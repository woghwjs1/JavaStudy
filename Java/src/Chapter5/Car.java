package Chapter5;

public class Car {
	//Car Ŭ���� �ʵ� ����
	String company = "�����ڵ���";
	String model = "�׷���";
	String color = "����";
	int maxSpeed = 350;
	int speed;
	
	//������
	Car(String color, int cc){
		
	}
	
	//�������� �����ε�
	Car(){}
	Car(String model){
		this(model, "����", 250);
	}
	Car(String model, String color){
		this(model, color, 250);
	}
	Car(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
