package jiwon.study.springapplicationcontext;

/**
 * 프레임워크(스프링)의 코드가 포함되지 않았다.
 * 이것이 POJO 기반.
 */
public class MyEvent  {

	private final int data;
	private final Object source;

	public MyEvent(Object source, int data) {
		this.source = source;
		this.data = data;
	}

	public Object getSource() {
		return source;
	}

	public int getData() {
		return data;
	}
}
