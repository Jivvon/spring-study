package jiwon.study.springapplicationcontext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements ApplicationRunner {

	@Autowired
	ApplicationContext ctx;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("proto");
		// Prototype의 bean은 다 다른 객체

		System.out.println(ctx.getBean(Proto.class));
		System.out.println(ctx.getBean(Proto.class));
		System.out.println(ctx.getBean(Proto.class));

		System.out.println("single");

		// Singleton의 bean은 다 같은 객체
		System.out.println(ctx.getBean(Single.class));
		System.out.println(ctx.getBean(Single.class));
		System.out.println(ctx.getBean(Single.class));

		System.out.println("proto by single");

		// Singleton bean에서 사용하므로 Prototype scope라도 다 같은 객체
		System.out.println(ctx.getBean(Single.class).getProto());
		System.out.println(ctx.getBean(Single.class).getProto());
		System.out.println(ctx.getBean(Single.class).getProto());
	}
}
