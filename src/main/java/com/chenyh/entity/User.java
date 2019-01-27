package com.chenyh.entity;


import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.*;

@Table(name = "user")
@Entity
@Data
@Accessors(chain = true)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;
    private String userName;

}
