package jiwon.study.springapplicationcontext;

import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class AnotherHandler {
	@EventListener
//	@Order(Ordered.HIGHEST_PRECEDENCE + 2) // 값을 더해주면 나중에 실행된다.
	@Async
	public void handle(MyEvent myEvent) {
		System.out.println(Thread.currentThread().toString());
		System.out.println("Another 이벤트 " + myEvent.getData());
	}
}
