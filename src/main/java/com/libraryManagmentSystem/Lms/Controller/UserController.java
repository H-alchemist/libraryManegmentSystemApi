package com.libraryManagmentSystem.Lms.Controller;


import com.libraryManagmentSystem.Lms.Model.User;
import com.libraryManagmentSystem.Lms.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api")
public class UserController {

    @Autowired
    UserService US;

    @PostMapping("/users/post")
    public ResponseEntity<?> addUser(@RequestBody User user){

        try {
            US.add(user);
            return new ResponseEntity<>( HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>( HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping("/users/check")
    public ResponseEntity<?> checkLogin(@RequestBody User user){

        if(US.checkUser(user)==true){
            return new ResponseEntity<>( HttpStatus.ACCEPTED);

        }else{
            return new ResponseEntity<>( HttpStatus.BAD_REQUEST);
        }
    }


    @PostMapping("/users/addToCollection")
    public ResponseEntity<?> addBook(@PathVariable Long id , Long book_id)
    {
        US.addBookToCollection(id,  book_id);
        return new ResponseEntity<>(HttpStatus.OK);
    }









}
