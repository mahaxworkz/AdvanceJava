package com.xworkz.bookshop.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Table(name = "Bookshop")
@Entity
@NamedQuery(name="exists" ,query="select dto from BookDto dto where dto.bookName=:nm")
@NamedQuery(name="readall" ,query="select dto from BookDto dto")
public class BookDto {
	
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private int id;
	private String bookName;
	private String authorName;
	private String publisher;
    private int publishedin;
	private String language;
	private String content;
	
	public BookDto() {
		 System.out.println("default");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getPublishedin() {
		return publishedin;
	}

	public void setPublishedin(int publishedin) {
		this.publishedin = publishedin;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public BookDto(String bookName, String authorName, String publisher, int publishedin, String language,
			String content) {
		super();
		this.bookName = bookName;
		this.authorName = authorName;
		this.publisher = publisher;
		this.publishedin = publishedin;
		this.language = language;
		this.content = content;
	}

	@Override
	public String toString() {
		return "BookDto [id=" + id + ", bookName=" + bookName + ", authorName=" + authorName + ", publisher="
				+ publisher + ", publishedin=" + publishedin + ", language=" + language + ", content=" + content + "]";
	}
	
	

}
