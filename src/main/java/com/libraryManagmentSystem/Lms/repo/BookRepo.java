package com.libraryManagmentSystem.Lms.repo;

import com.libraryManagmentSystem.Lms.Model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepo extends JpaRepository<Book , Long> {



    List<Book> findByCategory(String category);

    List<Book> findByAuthor(String author);

    Book findByBookId(Long bookId);
}
