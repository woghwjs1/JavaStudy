package Chapter10;

import java.util.Arrays;

public class ArrayCopyExample {
	//�迭 ����
	public static void main(String[] args) {
		char[] arr1 = {'J', 'A', 'V', 'A'};
		
		//���1
		char[] arr2 = Arrays.copyOf(arr1, arr1.length);	//arr1 ��ü�� arr2�� ����
		System.out.println(Arrays.toString(arr2));
		
		//���2
		char[] arr3 = Arrays.copyOfRange(arr1, 1, 3);
		//arr1[1]-[2]�� arr3[0]-[1]�� ����
		System.out.println(arr3);
		
		//���3
		char[] arr4 = new char[arr1.length];
		System.arraycopy(arr1, 0, arr4, 0, arr1.length);//arr1 ��ü�� arr4�� ����
		for(int i=0; i<arr4.length; i++) {
			System.out.println("arr4[" + i + "] : " + arr4[i]);
		}
		
		

	}

}
