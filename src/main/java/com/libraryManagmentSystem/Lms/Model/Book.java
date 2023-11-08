package com.libraryManagmentSystem.Lms.Model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "Book")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Book {

    @Id
    @Column(name = "id"  )
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Book_name" )
    private  String Book_name;
}
