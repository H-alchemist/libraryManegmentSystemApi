package com.libraryManagmentSystem.Lms.repo;

import com.libraryManagmentSystem.Lms.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
  public  interface UserRepo extends JpaRepository<User, Long> {




}
