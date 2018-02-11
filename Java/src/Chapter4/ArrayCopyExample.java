package Chapter4;

public class ArrayCopyExample {
	// System.arraycopy()로 배열 복사
	public static void main(String[] args) {
		String[] oldArray = {"java", "array", "copy"};
		String[] newArray = new String[5];
		
		System.arraycopy(oldArray, 0, newArray, 0, oldArray.length);
		
		for(int i=0; i<newArray.length; i++) {
			System.out.print(newArray[i] + ", ");
		}

	}

}
