package Chapter10;

public class NewInstanceExample {
	//悼利 按眉 积己 棺 角青
	public static void main(String[] args) {
		try {
			Class clazz = Class.forName("Chapter10.NewInstanceSendAction");
			//Class clazz = Class.forName("Chapter10.NewInstanceReceivedAction");
			NewInstanceAction action = (NewInstanceAction) clazz.newInstance();
			action.execute();
		} catch (ClassNotFoundException e) {
			e.getStackTrace();
		} catch (InstantiationException e) {
			e.getStackTrace();
		} catch (IllegalAccessException e) {
			e.getStackTrace();
		}

	}

}
