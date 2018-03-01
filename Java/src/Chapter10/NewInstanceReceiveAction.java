package Chapter10;

public class NewInstanceReceiveAction implements NewInstanceAction{
	@Override
	public void execute() {
		System.out.println("데이터를 받습니다.");
	}
}
