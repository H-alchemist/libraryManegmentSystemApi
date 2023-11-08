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
    @Column(name = "book_id"  )
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long book_id;

    @Column(name = "Book_name" )
    private  String Book_name;

    @Column(name = "price" )
    private  String price;

    @Column(name = "category" )
    private  String category;

    @Column(name = "author" )
    private  String author;

    @Column(name = "quantity " )
    private  String quantity ;
}
