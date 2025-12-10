package com.library.book_management.repository;

import com.library.book_management.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
    // Derived query methods (no implementation needed)

    boolean existsByTitle(String title);

    void deleteByIsbn(String isbn);

    boolean existsByIsbn(String isbn);

    void updatePriceById(Long id, double price);


    int countByCategory(String category);

    // Optional examples:
    // List<Book> findAllByAuthor(String author);
    // Optional<Book> findByIsbn(String isbn);
}
