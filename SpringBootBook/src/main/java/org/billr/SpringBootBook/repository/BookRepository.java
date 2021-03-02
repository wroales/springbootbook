package org.billr.SpringBootBook.repository;

import java.util.List;

import org.billr.SpringBootBook.models.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Integer>{
//	public Integer createBook(Book book);
//	public List<Book> getAllBooks();
}
