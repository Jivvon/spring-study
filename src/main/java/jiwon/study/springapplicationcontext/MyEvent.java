package jiwon.study.springapplicationcontext;

import org.springframework.context.ApplicationEvent;

/**
 * bean으로 등록되는 이벤트가 아니다.
 */
public class MyEvent extends ApplicationEvent {

	private int data;

	public MyEvent(Object source) {
		super(source);
	}

	public MyEvent(Object source, int data) {
		super(source);
		this.data = data;
	}

	public int getData() {
		return data;
	}
}
