package com.rll.microservices.books;

import com.rll.microservices.books.dao.BookDAO;
import com.rll.microservices.books.model.Book;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.web.client.RestTemplate;

@EnableMongoRepositories(basePackageClasses = { BookDAO.class, Book.class })
@SpringBootApplication
public class BookService {

    @Bean
    RestTemplate restTemplate(){
        return new RestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(BookService.class, args);
    }
}