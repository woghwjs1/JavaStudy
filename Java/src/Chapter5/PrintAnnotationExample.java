package Chapter5;

import java.lang.reflect.Method;

public class PrintAnnotationExample {
	//������̼� ����
	public static void main(String[] args) {
		//PrintAnnotationService Ŭ�����κ��� �޼ҵ� ������ ����
		Method[] declaredMethods = PrintAnnotationService.class.getDeclaredMethods();
		
		//Method ��ü�� �ϳ��� ó��
		for(Method method : declaredMethods) {
			//PrintAnnotation�� ����Ǿ����� Ȯ��
			if(method.isAnnotationPresent(PrintAnnotation.class)) {
				//PrintAnnotation ��ü ���
				PrintAnnotation printAnnotation = method.getAnnotation(PrintAnnotation.class);
				
				//�޼ҵ� �̸� ���
				System.out.println(method.getName() + "> ");
				
				//���м� ���
				for(int i=0; i<printAnnotation.number(); i++) {
					System.out.print(printAnnotation.value());
				}
				System.out.println();
				
				try {
					//�޼ҵ� ȣ��
					method.invoke(new PrintAnnotationService());
				} catch (Exception e) {	}
				System.out.println();
			}
		}

	}

}
