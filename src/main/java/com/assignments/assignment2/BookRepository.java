package com.assignments.assignment2;

import java.util.List;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Configuration
@Component
@Repository
public interface BookRepository extends MongoRepository<Book, Double >  {
	
	@Cacheable("books")
	List<Book> findByPriceGreaterThan(Double price);
	
	

	Book findByBookName(String bookName);
	
	@CacheEvict(value="books", allEntries = true)
	List<Book> findByBookNameNot(String bookName);
	
	
	

}
