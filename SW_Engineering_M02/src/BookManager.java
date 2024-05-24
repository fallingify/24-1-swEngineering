/*
 * import java.util.HashMap; import java.util.Map;
 * 
 * public class BookManager {
 * 
 * public class Book { private String id, title, author; private int
 * publishedYear;
 * 
 * public Book(String id, String title, String author, int publishedYear) {
 * this.id = id; this.title = title; this.author = author; this.publishedYear =
 * publishedYear; }
 * 
 * public String GetId() { return id; }
 * 
 * public String toString() { return "Book{id: '" + id + "', 제목: '" + title +
 * "', 저자: " + author + "', 출판년도: " + publishedYear + "}"; } }
 * 
 * 
 * private Map<String, Book> bookMap;
 * 
 * public BookManager() { this.bookMap = new HashMap<>(); }
 * 
 * public void AddBook(Book book) { if(bookMap.containsKey(book.GetId())) {
 * System.out.println("해당 ID(" + book.GetId() + ") 는 이미 존재합니다."); //return
 * false; } else { bookMap.put(book.GetId(), book); System.out.println(book +
 * "도서가 추가되었습니다."); //return true; } }
 * 
 * public void SearchBook(String id) { Book book = bookMap.get(id); if(book ==
 * null) { System.out.println("검색된 도서가 없습니다."); } else {
 * System.out.println("검색 결과:"); System.out.println(book); } }
 * 
 * public void RemoveBook(String id) { Book book = bookMap.get(id); if(book ==
 * null) { System.out.println("해당 ID(" + id + ")의 도서를 찾을 수 없습니다."); } else {
 * bookMap.remove(id); System.out.println(book + "도서를 삭제하였습니다."); } }
 * 
 * public static void main(String[] args) { // TODO Auto-generated method stub
 * 
 * } }
 */

import java.util.ArrayList;



public class BookManager {

	

	private ArrayList<Book> bookList;

	

	public BookManager() {

		bookList = new ArrayList<>();

	}

	public void AddBook(int id, String name, String author, int date) {

		for(Book book : bookList) {

			if (book.getId() == id) {

				System.out.println("해당 ID("+id+")는 이미 존재합니다.");

				return;

			}

		}

		System.out.println("Book{id: '"+id+"', 제목: '"+ name + "', 저자: '"+author+"', 출판년도: "+date+"}도서가 추가되었습니다");

		bookList.add(new Book(id, name, author, date));

	}

	public void SearchBook(int id) {

		for(Book book : bookList) {
			if(book.getId() == id) {
			System.out.println("검색결과:\n"+"Book{id: '"+ book.getId()+"', 제목: '"+ book.getName() + "', 저자: '"+book.getAuthor()+"', 출판년도: "+book.getDate()+"}");
			return;
			}
		}
		System.out.println("해당 ID (" + id + ")의 도서는 찾을 수 없습니다.");
	}

	public void RemoveBook(int id) {

		for(Book book : bookList) {

			if (book.getId() == id) {

				System.out.println("Book{id: '"+ book.getId()+"', 제목: '"+ book.getName() + "', 저자: '"+book.getAuthor()+"', 출판년도: "+book.getDate()+"}도서를 삭제하였습니다.");		

				bookList.remove(id-1);

				return;

			}

		}

	}

}
