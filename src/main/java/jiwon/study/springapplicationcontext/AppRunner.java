package jiwon.study.springapplicationcontext;

import java.nio.file.Files;
import java.nio.file.Path;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements ApplicationRunner {

	@Autowired
	ResourceLoader resourceLoader;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println(resourceLoader.getClass());

		// getResource의 파라미터로 그냥 이름만 적으면 ServletContextResource로 리졸빙이 된다.
		// classpath: 접두어를 붙이면 ClassPathResource로 리졸빙이 되고,
		// target/classes가 root가 되어 리소스를 찾는다.
		Resource resource = resourceLoader.getResource("classpath:test.txt");
		System.out.println(resource.getClass());

		System.out.println(resource.exists());
		System.out.println(resource.getDescription());
		System.out.println(Files.readString(Path.of(resource.getURI())));
	}
}
