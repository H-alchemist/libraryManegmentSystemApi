package com.libraryManagmentSystem.Lms.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "Admin")
@Table(name = "\"Admin\"")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Admin {

    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;



    @Column(name = "full_name")
    private String full_name;


    @Column(name = "type")
    private String type;

    @Column(name = "email", unique = true)
    private Long email;


    @Column(name = "password")
    private String password;

}