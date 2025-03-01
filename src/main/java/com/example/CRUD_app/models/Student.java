package com.example.CRUD_app.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "students")
public class Student {

    @Id
    private String id;
    private String name;
    private int age;
    private String email;

}
