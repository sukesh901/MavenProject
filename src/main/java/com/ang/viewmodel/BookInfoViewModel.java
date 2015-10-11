package com.ang.viewmodel;

import java.util.Date;
import java.util.Set;

import com.ang.model.Price;

public class BookInfoViewModel {
	
	private Integer bookId;
	private PriceViewModel price;
	private Set<String> genre;
	private String imgUrl;
	private String bookName;
	private String bookAuthor;
	private Date pubdate;
	private String bookDesc;
	private String country;
	private Integer pages;
	private String language;
	private String series;
	
	
	
	public BookInfoViewModel(){
		
	}
	
	
	
	public BookInfoViewModel(Integer bookId, PriceViewModel price, String bookName,
			String bookAuthor, Date pubdate, String bookDesc,Set<String> genre) {
	
		this.bookId = bookId;
		this.price = price;
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.pubdate = pubdate;
		this.bookDesc = bookDesc;
		this.genre=genre;
	}



	public Integer getBookId() {
		return bookId;
	}
	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}
	public PriceViewModel getPrice() {
		return price;
	}
	public void setPrice(PriceViewModel price) {
		this.price = price;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	public Date getPubdate() {
		return pubdate;
	}
	public void setPubdate(Date pubdate) {
		this.pubdate = pubdate;
	}
	public String getBookDesc() {
		return bookDesc;
	}
	public void setBookDesc(String bookDesc) {
		this.bookDesc = bookDesc;
	}



	public String getImgUrl() {
		return imgUrl;
	}



	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}



	public Set<String> getGenre() {
		return genre;
	}



	public void setGenre(Set<String> genre) {
		this.genre = genre;
	}



	public String getCountry() {
		return country;
	}



	public void setCountry(String country) {
		this.country = country;
	}



	public Integer getPages() {
		return pages;
	}



	public void setPages(Integer pages) {
		this.pages = pages;
	}



	public String getLanguage() {
		return language;
	}



	public void setLanguage(String language) {
		this.language = language;
	}



	public String getSeries() {
		return series;
	}



	public void setSeries(String series) {
		this.series = series;
	}


	
}
