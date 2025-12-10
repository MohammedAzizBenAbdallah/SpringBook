package com.library.book_management.controller;

import com.library.book_management.model.Book;
import com.library.book_management.service.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookController {

    private final BookService bookService;

    // FIXED — Spring now injects BookService correctly
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping("/saveBook")
    public void saveBook(@RequestBody Book book) {
        bookService.saveBook(book);
    }

    @GetMapping("/inventory")
    public int inventory(@RequestParam String category) {
        return bookService.inventory(category);
    }

    // FIXED — only ONE request body JSON object
    @PutMapping("/updateBook")
    public void updateBook(@RequestBody UpdateBookRequest req) {
        bookService.updatePrice(req.getId(), req.getPrice());
    }

    @DeleteMapping("/deleteBook/{isbn}")
    public void deleteBook(@PathVariable String isbn) {
        bookService.deleteBook(isbn);
    }

    @GetMapping("/getAll")
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }
}
