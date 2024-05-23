package task;



import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class BookTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outContent));
        Book.books.clear(); 
    }

    @org.junit.jupiter.api.AfterEach
    void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    void testAddBook() {
        Book.addBook("1", "자바 기초", "Jane", 2021);
        assertEquals("Book{id='1', title='자바 기초', author='Jane', year=2021} 도서가 추가되었습니다.\n", outContent.toString().trim() + "\n");
        outContent.reset();

        Book.addBook("1", "자바 기초", "Jane", 2021);
        assertEquals("해당 ID(1)는 이미 존재합니다.\n", outContent.toString().trim() + "\n");
    }

    @Test
    void testSearchBook() {
        Book.addBook("1", "자바 기초", "Jane", 2021);
        outContent.reset();

        Book.searchBook("1");
        assertEquals("검색 결과:\nBook{id='1', title='자바 기초', author='Jane', year=2021}\n", outContent.toString().trim() + "\n");
    }
    @Test
    void testSearchAllBooks() {
        Book.addBook("1", "자바 기초", "Jane", 2021);
        Book.addBook("2", "소프트웨어 공학", "Tom", 2014);
        outContent.reset();

        Book.searchAllBooks();
        assertEquals("검색 결과:\n" +
                     "Book{id='1', title='자바 기초', author='Jane', year=2021}\n" +
                     "Book{id='2', title='소프트웨어 공학', author='Tom', year=2014}\n", outContent.toString().trim() + "\n");
    }

    @Test
    void testDeleteBook() {
        Book.addBook("1", "자바 기초", "Jane", 2021);
        outContent.reset();

        Book.deleteBook("1");
        assertEquals("Book{id='1', title='자바 기초', author='Jane', year=2021} 도서를 삭제하였습니다.\n", outContent.toString().trim() + "\n");
        outContent.reset();

        Book.deleteBook("1");
        assertEquals("해당 ID(1)의 도서를 찾을 수 없습니다.\n", outContent.toString().trim() + "\n");
    }
    @Test
    void testUpdateBook() {
        Book.addBook("1", "자바 기초", "Jane", 2021);
        outContent.reset();

        Book.updateBook("1", "자바 심화", "Jane", 2022);
        assertEquals("도서 정보가 업데이트 되었습니다.\n", outContent.toString().trim() + "\n");
        outContent.reset();

        Book.searchBook("1");
        assertEquals("검색 결과:\nBook{id='1', title='자바 심화', author='Jane', year=2022}\n", outContent.toString().trim() + "\n");
        outContent.reset();

        Book.updateBook("2", "알고리즘", "Alice", 2020);
        assertEquals("해당 ID(2)의 도서를 찾을 수 없습니다.\n", outContent.toString().trim() + "\n");
    }

}
