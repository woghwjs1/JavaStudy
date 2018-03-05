package Chapter14;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
	//Queue를 이용한 메세지 큐
	public static void main(String[] args) {
		Queue<Message> messageQueue = new LinkedList<Message>();
		
		//메세지 저장
		messageQueue.offer(new Message("sendMail", "홍길동"));
		messageQueue.offer(new Message("sendSMS", "신용권"));
		messageQueue.offer(new Message("sendKakaotalk", "홍두께"));
		
		while(!messageQueue.isEmpty()) {
			Message message = messageQueue.poll();
			switch(message.command) {
			case "sendMail":
				System.out.println(message.to + "님에게 메일을 보냅니다.");
				break;
			case "senSMS":
				System.out.println(message.to + "님에게 문자를 보냅니다.");
				break;
			case "sendKakaotalk":
				System.out.println(message.to + "님에게 카톡을 보냅니다.");
				break;
			}
		}

	}

}
