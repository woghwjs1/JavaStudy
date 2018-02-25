package Chapter10;

public class DeepCloneMemberExample {
	//���� ���� �� ������ ������ ������ ������ ��ġ�� �ʴ´�.
	public static void main(String[] args) {
		//���� ��ü ����
		DeepCloneMember original = new DeepCloneMember("ȫ�浿", 25, new int[] {100,100}, new DeepCloneCar("�ҳ�Ÿ")); 
		
		//���� ��ü�� ���� �� ������ ����
		DeepCloneMember cloned = original.getDeepCloneMember();
		cloned.scores[0] = 90;
		cloned.car.model = "�׷���"; 
		
		System.out.println("[���� ��ü�� �ʵ尪]");
		System.out.println("name : " + cloned.name);
		System.out.println("age : " + cloned.age);
		System.out.print("scores : ");
		for(int i=0; i<cloned.scores.length; i++) {
			System.out.print(cloned.scores[i]);
			System.out.print((i==(cloned.scores.length-1))?"":",");
		}
		System.out.println();
		System.out.println("car : " + cloned.car.model);
		
		System.out.println();
		
		//���� ��ü�� �ʵ尪 ���� ����
		System.out.println("[���� ��ü�� �ʵ尪]");
		System.out.println("name : " + original.name);
		System.out.println("age : " + original.age);
		System.out.print("scores : ");
		for(int i=0; i<original.scores.length; i++) {
			System.out.print(original.scores[i]);
			System.out.print((i==(cloned.scores.length-1))?"":",");
		}
		System.out.println();
		System.out.println("car : " + original.car.model);
		
	}

}
