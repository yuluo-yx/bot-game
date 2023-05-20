package com.example.backendplus.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class User {
    @TableId(type = IdType.AUTO)
    private Integer id;
    private String username;
    private String password;
    private String photo;
    private Integer rating;

    public User(Integer id, String username, String password, String photo, Integer rating) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.photo = photo;
        this.rating = rating;
    }

    public User() {
    }
}
