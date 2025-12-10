package com.library.book_management.service;

import com.library.book_management.model.Book;
import com.library.book_management.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void saveBook(Book book) {
        bookRepository.save(book);
    }

    public int inventory(String category) {
        return bookRepository.countByCategory(category);
    }

    public void updatePrice(Long id, double price) {
        bookRepository.updatePriceById(id, price);
    }


    public void deleteBook(String isbn) {
        bookRepository.deleteByIsbn(isbn);
    }
    public List<Book> getAllBooks() {
        return bookRepository.getBooks();
    }
}
