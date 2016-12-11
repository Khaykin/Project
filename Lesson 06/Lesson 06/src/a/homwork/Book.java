package a.homwork;

import java.util.Arrays;

public class Book {

	// attributes
	private String title;
	private String[] authors = new String[5];
	private double price;

	// CTOR
	public Book(String title, String author, double price) {
		this.title = title;
		authors[0] = author;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String[] getAuthors() {
		return authors;
	}

	public void addAuthor(String author) {
		for (int i = 0; i < authors.length; i++) {
			if (authors[i] == null) {
				authors[i] = author;
				return;
			}
		}

		// if we are here there was no room for another author
		// we need a bigger authors array
		String[] arr = new String[authors.length + 1];
		// copy all authors to the new array
		System.arraycopy(authors, 0, arr, 0, authors.length);
		// add the new author
		arr[arr.length - 1] = author;
		// assign the authors reference a new array address
		this.authors = arr;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	

	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append("Book [title=").append(title).append(", authors=");
		
		for (int i = 0; i < authors.length; i++) {
			if(authors[i]!=null){
				sb.append(", ").append(authors[i]);
			}
		}
		
		sb.append(", price=").append(price).append("]");
		
		return sb.toString();
	}

	// main
	public static void main(String[] args) {

		Book b = new Book("abc", "athor 1", 100);
		b.addAuthor("author 2");
		b.addAuthor("x");
		System.out.println(b);
		
//		b.addAuthor("author 2");
//		System.out.println(Arrays.toString(b.authors));
//		b.addAuthor("x");
//		System.out.println(Arrays.toString(b.authors));
//		b.addAuthor("y");
//		System.out.println(Arrays.toString(b.authors));
//		b.addAuthor("z");
//		System.out.println(Arrays.toString(b.authors));
//		b.addAuthor("six");
//		System.out.println(Arrays.toString(b.authors));

	}

}
