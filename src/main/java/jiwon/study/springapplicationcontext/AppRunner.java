package jiwon.study.springapplicationcontext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements ApplicationRunner {

	@Autowired
	Single single;

	@Autowired
	Proto proto;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println(proto); // ApplicationRunner가 가지고 있는 proto
		System.out.println(single.getProto()); // single이 참조하고 있는 proto
	}
}