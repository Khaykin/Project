package books;

public class Books {

	public String bookname;
	public int bookprice;
	public String author;
	/**
	 * @param bookname
	 * @param bookprice
	 * @param author
	 */
	public Books(String bookname, int bookprice, String author) {
		super();
		this.bookname = bookname;
		this.bookprice = bookprice;
		this.author = author;
	}
	/**
	 * @return the bookname
	 */
	private String getBookname() {
		return bookname;
	}
	/**
	 * @param bookname the bookname to set
	 */
	private void setBookname(String bookname) {
		this.bookname = bookname;
	}
	/**
	 * @return the bookprice
	 */
	private int getBookprice() {
		return bookprice;
	}
	/**
	 * @param bookprice the bookprice to set
	 */
	private void setBookprice(int bookprice) {
		this.bookprice = bookprice;
	}
	/**
	 * @return the author
	 */
	private String getAuthor() {
		return author;
	}
	/**
	 * @param author the author to set
	 */
	private void setAuthor(String author) {
		this.author = author;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Books [bookname=" + bookname + ", bookprice=" + bookprice + ", author=" + author + "]";
	}
	
	
	
}

	
	