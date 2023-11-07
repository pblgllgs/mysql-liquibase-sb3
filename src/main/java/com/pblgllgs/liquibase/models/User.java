package com.pblgllgs.liquibase.models;

/**
 * @author pblgl
 * Created on 07-11-2023
 */

import jakarta.persistence.*;

import java.util.Date;

@Table(name = "users")
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "email")
    private String email;
    @Column(name = "password")
    private String password;

    @Column(name = "created_at")
    private Date createdAt;

}