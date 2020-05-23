package org.example.pojo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class User2 implements Serializable {
    private Long uid ;
    private String name ;
    private Integer age ;
    private Date birthday ;
    private Double salary ;
    //省略get/set方法
}