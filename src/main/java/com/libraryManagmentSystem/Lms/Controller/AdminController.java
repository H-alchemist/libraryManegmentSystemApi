package com.libraryManagmentSystem.Lms.Controller;

import com.libraryManagmentSystem.Lms.Model.Admin;
import com.libraryManagmentSystem.Lms.Model.User;
import com.libraryManagmentSystem.Lms.Service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class AdminController {


    @Autowired
    AdminService AS;


    @PostMapping("/admin/post")
    public ResponseEntity<?> addAdmin(@RequestBody Admin admin){

        try {
            AS.add(admin);
            return new ResponseEntity<>( HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>( HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping("/Admin/check")
    public ResponseEntity<?> checkLogin(@RequestBody Admin admin){

        if(AS.checkAdmin(admin)==true){
            return new ResponseEntity<>( HttpStatus.ACCEPTED);

        }else{
            return new ResponseEntity<>( HttpStatus.BAD_REQUEST);
        }
    }


}
