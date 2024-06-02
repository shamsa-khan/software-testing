package com.example.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class BookServiceTest {

    private BookService bookService;

    @BeforeEach
    public void setUp() {
        //IBookRepository bookRepository = new BookRepository();
        IBookRepository bookRepository = new FakeRepositoryForTest();
        bookService = new BookService(bookRepository);
    }

    @Test
    public void testGetBooksByAuthor() {
        List<Book> books = bookService.getBooksByAuthor("Kent Beck");
        Assertions.assertEquals(1, books.size());
        System.out.println("testGetBooksByAuthor: Found " + books.size() + " books");
        books.forEach(book -> System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor()));
        Assertions.assertEquals("Test Driven Development", books.get(0).getTitle());
    }

    @Test
    public void testGetBooksByAuthor_NoBooksFound() {
        List<Book> books = bookService.getBooksByAuthor("Unknown Author");
        System.out.println("testGetBooksByAuthor_NoBooksFound: Found " + books.size() + " books");
        Assertions.assertEquals(0, books.size());
    }

    @Test
    public void testGetBooksByTitle() {
        List<Book> books = bookService.getBooksByTitle("Clean Code");
        Assertions.assertEquals(1, books.size());
        System.out.println("testGetBooksByTitle: Found " + books.size() + " books");
        Assertions.assertEquals("Clean Code", books.get(0).getTitle());
    }

    @Test
    public void testGetBooksByTitle_NoBooksFound() {
        List<Book> books = bookService.getBooksByTitle("Unknown Title");
        System.out.println("testGetBooksByTitle_NoBooksFound: Found " + books.size() + " books");
        Assertions.assertEquals(0, books.size());
    }

    @Test
    public void testGetBooksByAuthorAndTitle() {
        List<Book> books = bookService.getBooksByAuthorAndTitle("Robert C. Martin", "Clean Code");
        Assertions.assertEquals(1, books.size());
        System.out.println("testGetBooksByAuthorAndTitle: Found " + books.size() + " books");
        books.forEach(book -> System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor()));
        Assertions.assertEquals("Clean Code", books.get(0).getTitle());
    }

    @Test
    public void testGetBooksByAuthorAndTitle_NoBooksFound() {
        List<Book> books = bookService.getBooksByAuthorAndTitle("Unknown Author", "Unknown Title");
        System.out.println("testGetBooksByAuthorAndTitle_NoBooksFound: Found " + books.size() + " books");
        Assertions.assertEquals(0, books.size());
    }
}
