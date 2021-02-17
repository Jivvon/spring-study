package jiwon.study.springapplicationcontext;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component // 핸들러는 빈으로 등록되어야 한다
public class MyEventHandler implements ApplicationListener<MyEvent> {

	@Override
	public void onApplicationEvent(MyEvent event) {
		System.out.println("이벤트 받았다. 데이터는 " + event.getData());
	}
}
