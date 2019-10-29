package lv.jg.lesson5.homework1;

import java.util.Objects;

public class Book {

	private String author, title;
	private int pageCount;

	Book(String author, String title, int pageCount) {
		this.author = author;
		this.pageCount = pageCount;
		this.title = title;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Book book = (Book) o;
		return Objects.equals(author, book.author) &&
				Objects.equals(title, book.title) &&
				Objects.equals(pageCount, book.pageCount);
	}

	@Override
	public String toString() {
		return "Book{" 
				+ "Author='" + author + '\'' 
				+ ", Title='" + title + '\''
				+ ", Page count='" + pageCount + '\'' + '}';
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPageCount() {
		return pageCount;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}

}
