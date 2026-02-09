package in.kce.book.bean;

public class BookBean {
 private String isbn;
 private String Bookname;
 private AuthorBean author;
 private char bookType;
 public String getIsbn() {
	return isbn;
}
 public void setIsbn(String isbn) {
	this.isbn = isbn;
 }
 public String getBookname() {
	return Bookname;
 }
 public void setBookname(String bookname) {
	Bookname = bookname;
 }
 public AuthorBean getAuthor() {
	return author;
 }
 public void setAuthor(AuthorBean author) {
	this.author = author;
 }
 public char getBookType() {
	return bookType;
 }
 public void setBookType(char bookType) {
	this.bookType = bookType;
 }
 public float getCost() {
	return cost;
 }
 public void setCost(float cost) {
	this.cost = cost;
 }
 private float cost;
 
 
}
