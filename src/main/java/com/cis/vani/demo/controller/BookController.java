package com.cis.vani.demo.controller;

import com.cis.vani.demo.model.Book;
import com.cis.vani.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/{bookId}")
    public Book getBook(@PathVariable Integer bookId) {

        return bookService.getBook(bookId);
    }

    // create a book
    @PostMapping
    public Book createBook(@RequestBody Book book) {

        return bookService.createBook(book);
//    @Autowired
//    private BookService bookService;
//
//    // GET all books
//    @GetMapping
//        public List<Book> getAllBooks() {
//        return bookService.getAllBooks();
//    }
//
//    // GET a book by ID
//    @GetMapping("/{bookId}")
//    public Book getBookById(@PathVariable Long bookId) {
//        return bookService.getBookById(bookId);
//    }
//
//    // POST a new book
//    @PostMapping
//    public Book createBook(@RequestBody Book book) {
//        return bookService.createBook(book);
//    }
//
//    // PUT/update a book by ID
//    @PutMapping("/{bookId}")
//    public Book updateBook(@PathVariable Long bookId, @RequestBody Book book) {
//        return bookService.updateBook(bookId, book);
//    }

//    // DELETE a book by ID
//    @DeleteMapping("/{bookId}")
//    public void deleteBook(@PathVariable Long bookId) {
//        bookService.deleteBook(bookId);
//    }
    }
}