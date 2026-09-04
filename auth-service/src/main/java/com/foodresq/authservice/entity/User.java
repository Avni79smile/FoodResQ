package com.foodresq.authservice.entity; import jakarta.persistence.*;
@Entity @Table(name="users") public class User{
@Id @GeneratedValue(strategy=GenerationType.UUID) private String id; @Column(unique=true) private String email; private String password,role;
public User(){} public String getId(){return id;} public String getEmail(){return email;} public void setEmail(String v){email=v;}
public String getPassword(){return password;} public void setPassword(String v){password=v;} public String getRole(){return role;} public void setRole(String v){role=v;}}