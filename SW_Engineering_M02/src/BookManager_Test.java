import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BookManager_Test {

	private BookManager manager;
	
	@BeforeEach
	void setUp() throws Exception {
		manager = new BookManager();
	}
	
	@Test
	void testcase_01() {
		manager.AddBook(1, "자바 기초", "Jane", 2021);
		manager.AddBook(1, "자바 기초", "Jane", 2021);
	}
	
	@Test
	void testCase_02() {
		manager.AddBook(1, "자바 기초", "Jane", 2021);
		manager.AddBook(2, "소프트웨어 공학", "Tom", 2021);
		manager.AddBook(3, "분산 컴퓨팅", "Yoon", 2024);
		
		manager.SearchBook(1);
		manager.SearchBook(2);
		manager.SearchBook(3);
	}
	
	@Test
	void testCase_03() {
		manager.AddBook(1, "자바 기초", "Jane", 2021);
		manager.AddBook(2, "소프트웨어 공학", "Tom", 2021);
		manager.RemoveBook(1);
		manager.SearchBook(1);
	}

}
