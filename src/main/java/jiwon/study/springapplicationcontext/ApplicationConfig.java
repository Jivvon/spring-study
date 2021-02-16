package jiwon.study.springapplicationcontext;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

	@Bean
	public BookRepository bookRepository() {
		return new BookRepository();
	}

	@Bean
	public BookService bookService(BookRepository bookRepository){
		BookService bookService = new BookService();
		bookService.setBookRepository(bookRepository());
		return bookService;
	}

}