package Chapter6;

public class OverrideChild extends OverrideParent{
	//�ڽ�Ŭ����
	
	@Override
	double areaCircle(double r) {
		System.out.println("OverrideChild ��ü�� areaCircle() ����");
		return Math.PI * r * r;
	}
}
