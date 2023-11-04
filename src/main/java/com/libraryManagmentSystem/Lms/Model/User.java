package com.libraryManagmentSystem.Lms.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "User")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {

    @Id
    @Column(name = "id"  )
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "full_name" )
    private  String full_name;

    @Column(name="email" , unique = true)
    private Long email;


    @Column (name = "password")
    private  String password;


    // books handler


}
