package com.libraryManagmentSystem.Lms.Controller;

import com.libraryManagmentSystem.Lms.Model.Admin;
import com.libraryManagmentSystem.Lms.Model.Book;
import com.libraryManagmentSystem.Lms.Service.AdminService;
import com.libraryManagmentSystem.Lms.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
public class BookController {

    @Autowired
    BookService BS;


    @PostMapping("/Book/post")
    public ResponseEntity<?> addBook(@RequestBody Book book){


            BS.addBook(book);
            return new ResponseEntity<>( HttpStatus.OK);

    }
    @PostMapping("/Book/getAll")
    public ResponseEntity<?> addBook(){



        return new ResponseEntity<>(  BS.getAllBooks(), HttpStatus.OK);

    }

    @PostMapping("/Book/delete")
    public ResponseEntity<?> addBook(@PathVariable Long id){


        BS.deleteBook(id);
        return new ResponseEntity<>( HttpStatus.OK);

    }


    @PostMapping("/Book/byCategory")
    public ResponseEntity<List<Book>> getByCategory(@PathVariable String category){



        return new ResponseEntity<List<Book>>( BS.getBooksByCategory(category) , HttpStatus.OK);

    }

    @PostMapping("/Book/byAuthor")
    public ResponseEntity<List<Book>> addAuthor(@PathVariable String AU){



        return new ResponseEntity<List<Book>>( BS.getBooksByCategory(AU) , HttpStatus.OK);

    }

    @PostMapping("/Book/byId")
    public ResponseEntity<Book> addId(@PathVariable Long id){



        return new ResponseEntity<Book>( BS.getBookByID(id) , HttpStatus.OK);

    }














}
