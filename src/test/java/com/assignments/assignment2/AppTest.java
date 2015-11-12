package com.assignments.assignment2;

import java.util.List;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
@ComponentScan("com.assignments.assignment2")
@EnableMongoRepositories(basePackages = "com.assignments.assignment2")
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = { BookRepository.class,     Book.class })
@ContextConfiguration(locations = {"file:src/test/java/com/assignments/assignment2/resources/app-context.xml"})
public class AppTest 
    extends TestCase
{
	@Autowired
	private BookRepository repository;
	Book book = new Book();

	@org.junit.Test
	public void testDB() {
		System.out.println("DB is work correctly. The repository: " + repository);
	}

	@org.junit.Test
	public void testFindAll() {
		List<Book> booklist = (List<Book>) repository.findAll();
		
		for(Book book: booklist){
			System.out.println("Book Name : " + book.getBookName());
		}
	}
	
	@org.junit.Test
	public void testInsertBook() {
				
		book.setBookName("Junit Processing");
		book.setAuthor("Kerem");
		book.setISBN("1234567891012");
		book.setPrice(85.8);
		
		repository.insert(book);
		System.out.println("Insert is working. The name of new book is: " +
		((Book) repository.findByBookName("Junit Processing")).getBookName());
		
		
		
		
	}



}
