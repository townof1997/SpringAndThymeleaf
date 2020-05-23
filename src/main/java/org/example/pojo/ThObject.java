package org.example.pojo;

import lombok.Data;

@Data
public class ThObject {
    private Long id;
    private String thName;
    private String desc;

    public ThObject(Long id, String name, String describe) {
        this.id = id;
        this.thName = name;
        this.desc = describe;
    }
}
