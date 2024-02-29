package com.cis.vani.demo.repository;

import com.cis.vani.demo.entity.LibraryBook;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibraryBookRepository extends JpaRepository<LibraryBook, Integer> {
    // You can add custom queries or methods here if needed
    //List<Book> findByGenre(String genre);
}
