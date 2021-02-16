package jiwon.study.springapplicationcontext;

import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service // bean으로 등록
public class BookService {

	@Autowired
	BookRepository bookRepository;

	@PostConstruct
	public void setUp() {
		/*
		 * ## 라이프사이클 ##
		 * @PostConstruct: 서버가 띄워질 때 실행된다 (초기화)
		 * @PreDestroy: 서버가 종료될 때 실행된다 (소멸)
		 */
		System.out.println(bookRepository.getClass());
	}
}
