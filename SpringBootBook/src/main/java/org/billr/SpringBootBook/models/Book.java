package org.billr.SpringBootBook.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name="books")
public class Book {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer bookId;
	@NotEmpty(message="Book title must not be empty")
	private String title;
	@Size(min=2, max=25, message="Author must be between 2 and 25 characters")
	private String author;
	
	public Book() {}

	public Book(@NotEmpty String title, String author) {
		this.title = title;
		this.author = author;
	}

	public Integer getBookId() {
		return bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	@Override
	public String toString() {
		return "ID: " + this.bookId + "\nTitle: " + this.title + "\nAuthor: " + this.author + "\n";
	}
}
