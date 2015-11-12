package com.assignments.assignment2;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
@Component 
@Controller
public class BookController {
	
	Book book1 = new Book();
	
	@Autowired
	private BookRepository repository;
	
	
	
	@RequestMapping(value="/", method={RequestMethod.GET,RequestMethod.POST})
	public ModelAndView listPage(@RequestParam(name="bookName", required=false) String bookName,
			@RequestParam(name="author", required=false) String author,
			@RequestParam(name="ISBN", required=false) String ISBN,
			@RequestParam(name="price", required=false) Double price
			){
		
		
		ModelAndView model = new ModelAndView("index");
		List<Book> booklist = (List<Book>) repository.findByPriceGreaterThan(0.0);
		book1.setBookName(bookName);
		book1.setAuthor(author);
		book1.setISBN(ISBN);
		book1.setPrice(price);
		
		
		if(book1.getBookName() != null && book1.getAuthor() != null 
				&& book1.getISBN() != null && book1.getPrice() != null){
			
			System.out.println(book1.getBookName());
			repository.insert(book1);
			model = cacheEvict();
			System.out.println("Cache is removed. Data is coming from MongoLab.");
		}
		else{
			//findByPriceGreaterThan(0.0) provides a cachable data.
			
			model.addObject("booklist", booklist);
			System.out.println("Cache is running");
			
		}
		
		return model;
		
		
		
	}
	
	@RequestMapping(value="/addBook.html", method=RequestMethod.GET)
	public ModelAndView addBook(){
		
		ModelAndView model = new ModelAndView("addBook");
		
		return model;
	}
	
	@RequestMapping(value="/c.html", method=RequestMethod.GET)
	@CacheEvict(value="books", allEntries = true)
	public ModelAndView cacheEvict(){
		
		List<Book> booklist = (List<Book>) repository.findByBookNameNot("");
		
		ModelAndView model = new ModelAndView("index");
		model.addObject("booklist", booklist);
		return model;
		
	}

}
