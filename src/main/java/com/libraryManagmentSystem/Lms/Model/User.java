package com.libraryManagmentSystem.Lms.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Entity(name = "User")
@Table(name = "\"User\"")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {

    @Id
    @Column(name = "user_id"  )
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "full_name" )
    private  String full_name;


    @Column(name = "type" )
    private  String type;

    @Column(name="email" , unique = true)
    private Long email;



    @Column (name = "password")
    private  String password;



    @ElementCollection
    @CollectionTable(name = "user_order", joinColumns = @JoinColumn(name = "user_id"))
    @Column(name = "book_id")
    private ArrayList<Long> collection;


}
