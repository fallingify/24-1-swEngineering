//import java.util.ArrayList;

public class Book {

	private int id;

	private String name;

	private String author;

	private int date;



	public int getId() {return id;}

	public String getName() {return name;}

	public String getAuthor() {return author;}

	public int getDate() {return date;}

	

	public Book(int id, String name, String author, int date) {

		this.id = id;

		this.name = name;

		this.author = author;

		this.date = date;

	}

}
