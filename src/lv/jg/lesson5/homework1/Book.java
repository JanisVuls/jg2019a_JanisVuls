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
}
