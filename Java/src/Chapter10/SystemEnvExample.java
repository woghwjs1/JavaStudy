package Chapter10;

public class SystemEnvExample {
	// JAVA_HOME ȯ�� ���� �� ���
	public static void main(String[] args) {
		String javaHome = System.getenv("JAVA_HOME");
		System.out.println("JAVA_HOME: " + javaHome);

	}

}
