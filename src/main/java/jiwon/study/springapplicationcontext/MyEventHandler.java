package jiwon.study.springapplicationcontext;

import org.springframework.context.event.ContextClosedEvent;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component // 항상 핸들러는 빈으로 등록되어야 한다
public class MyEventHandler {

	@EventListener
//	@Order(Ordered.HIGHEST_PRECEDENCE)
	@Async
	public void handle(MyEvent event) {
		System.out.println(Thread.currentThread().toString());
		System.out.println("이벤트 받았다. 데이터는 " + event.getData());
	}

	@EventListener
	@Async
	public void handle(ContextRefreshedEvent event) {
		System.out.println(Thread.currentThread().toString());
		System.out.println("ContextRefreshedEvent");
	}

	@EventListener
	@Async
	public void handle(ContextClosedEvent event) {
		System.out.println(Thread.currentThread().toString());
		System.out.println("ContextClosedEvent");
	}
}
