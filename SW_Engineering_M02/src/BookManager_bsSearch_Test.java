//import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BookManager_bsSearch_Test {
	
	private BookManager manager;

	@BeforeEach
	void setUp() throws Exception {
		manager = new BookManager();
		System.out.println("새 BookManager 인스턴스 생성");
	}

	@Test
	void searchBs_Test01() {
		System.out.println("search_bs 테스트01 시작");
		manager.AddBook(1, "자바 기초", "Jane", 2021);
		manager.AddBook(2, "소프트웨어 공학", "Tom", 2021);
		manager.AddBook(3, "분산 컴퓨팅", "Yoon", 2024);
		
		manager.search_bs(1);
		System.out.println("search_bs 테스트01 통과 : 검색 결과: id(1), 자바 기초");
	}

	@Test
	void searchBs_Test02() {
		manager.AddBook(1, "자바 기초", "Jane", 2021);
		manager.AddBook(2, "소프트웨어 공학", "Tom", 2021);
		
		manager.RemoveBook(2);
		
		manager.search_bs(2);
		System.out.println("search_bs 테스트02 통과 : 해당 ID(2)의 도서는 찾을 수 없습니다.");
	}
	
	@Test
	void searchBs_Test03() {
		manager.AddBook(1, "자바 기초", "Jane", 2021);
		manager.AddBook(2, "소프트웨어 공학", "Tom", 2021);
		
		manager.RemoveBook(1);
		manager.AddBook(1, "자바 심화", "Lee", 2024);
		
		manager.search_bs(1);
		System.out.println("search_bs 테스트03 통과 : 검색 결과: id(1), 자바 심화");
	}
	
	@Test
	void searchBs_Test04() {	
		manager.search_bs(1);
		System.out.println("search_bs 테스트04 통과 : 해당 ID(1)의 도서는 찾을 수 없습니다.");
	}

}
