package com.libraryManagmentSystem.Lms.repo;

import com.libraryManagmentSystem.Lms.Model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepo extends JpaRepository<Book , Long> {
}
