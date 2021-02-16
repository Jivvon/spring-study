package jiwon.study.springapplicationcontext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service // bean으로 등록
public class BookService {

	BookRepository bookRepository;

	@Autowired // 생성자에서 의존성 주입
	public BookService(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}
}
