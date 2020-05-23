package org.example.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class User {
    private Long id;
    private Date date;
    private String name;

    public User(Long id) {
        this.id = id;
        this.date = new Date();
        this.name = "zhangsna";
    }

    public User(Long id, String name) {
        this.id = id;
        this.date = new Date();
        this.name = name;
    }
}
