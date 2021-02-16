package jiwon.study.springapplicationcontext;

import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements ApplicationRunner {

	@Autowired
	ApplicationContext ctx;

	@Autowired
	BookRepository bookRepository;

	@Value("${app.name}")
	String appName;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Environment environment = ctx.getEnvironment();
		System.out.println("environment.getProperty(\"app.name\") : " + environment.getProperty("app.name"));
		// Run/Debug Configurations의 VM Options 안에 -Dapp.nameInOpt=springInOpt 추가
		System.out.println("environment.getProperty(\"app.name\") : " + environment.getProperty("app.nameInOpt"));
		System.out.println("Value ${app.name} : " + appName);
	}
}
