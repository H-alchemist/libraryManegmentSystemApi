package com.libraryManagmentSystem.Lms.Service;

import com.libraryManagmentSystem.Lms.Model.Book;
import com.libraryManagmentSystem.Lms.repo.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    BookRepo BR;

    public Book addBook(Book book){

        return BR.save(book);

    }

    public List<Book> addMultipleBook(List<Book> book_List){

        return BR.saveAll(book_List);

    }


    public void deleteBook(Long book_id){

        BR.deleteById(book_id);

    }
    public void deleteALLBook(){

        BR.deleteAll();

    }


    public List<Book> getAllBooks(){
        return BR.findAll();
    }

    public List<Book> getBooksByCategory(String category){
        return BR.findByCategory(category);
    }

    public List<Book> getBooksByAuthor(String author){
        return BR.findByAuthor(author);
    }

    public Book getBookByID(Long book_id){
        return BR.findById(book_id).get();
    }






}
