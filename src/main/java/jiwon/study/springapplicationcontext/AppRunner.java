package jiwon.study.springapplicationcontext;

import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;
import org.springframework.validation.BeanPropertyBindingResult;
import org.springframework.validation.Errors;

@Component
public class AppRunner implements ApplicationRunner {

	@Autowired
	ResourceLoader resourceLoader;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Event event = new Event(); // 1. title을 주지 않았기 때문에 에러가 발생할 것이다
		EventValidator eventValidator = new EventValidator();
		// 인터페이스는 자주 사용하지만, 구현체(BeanPropertyBindingResult)는 스프링 MVC가 생성해서
		// 파라미터에 전달시켜주기 때문에 이렇게 직접 사용할 일은 거의 없다.
		Errors errors = new BeanPropertyBindingResult(event, "event");

		eventValidator.validate(event, errors);

		System.out.println(errors.hasErrors());

		errors.getAllErrors().forEach(e -> {
			System.out.println("===== error code =====");
			Arrays.stream(e.getCodes()).forEach(System.out::println);
			System.out.println(e.getDefaultMessage());
		});
	}
}
