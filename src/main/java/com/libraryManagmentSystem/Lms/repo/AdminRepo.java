package com.libraryManagmentSystem.Lms.repo;

import com.libraryManagmentSystem.Lms.Model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepo extends JpaRepository<Admin , Long> {
}
