package ch15.sec06.exan02;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {

		// Queue 컬렉션 생성
		Queue<Message> messageQueue = new LinkedList<>();

		// 메시지 넣기    //순서 바꾸면 실행 순서도 바뀜(switch문은 순서에 상관 없음) 
		messageQueue.offer(new Message("sendMail", "홍길동"));
		messageQueue.offer(new Message("sendSMS", "신용권"));
		messageQueue.offer(new Message("sendKaKaotalk", "김자바"));

		// 메시지를 하나씩 꺼내어 처리
		while (!messageQueue.isEmpty()) {  //비어있지 않다면 반복
			Message message = messageQueue.poll();
			switch (message.command) {
			case "sendMail":
				System.out.println(message.to + "님에게 메일을 보냅니다.");
				break;
			case "sendSMS":
				System.out.println(message.to + "님에게 SMS를 보냅니다.");
				break;
			case "sendKaKaotalk":
				System.out.println(message.to + "님에게 카카오톡을 보냅니다. ");
				break;
			}
		}
	}
}
