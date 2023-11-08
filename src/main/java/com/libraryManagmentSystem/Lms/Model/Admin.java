package com.libraryManagmentSystem.Lms.Model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "Admin")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Admin {
    @Id
    @Column(name = "id"  )
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "full_name" )
    private  String full_name;
}
