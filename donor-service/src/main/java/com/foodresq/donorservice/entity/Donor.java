package com.foodresq.donorservice; import jakarta.persistence.*;
@Entity @Table(name="donors") public class Donor{
@Id @GeneratedValue(strategy=GenerationType.UUID) private String id; private String name;
private String email;
private String phone;
private String address;
private String city;
public Donor(){} public String getId(){return id;} public void setId(String v){id=v;} public String getName(){return name;} public void setName(String v){name=v;}
public String getEmail(){return email;} public void setEmail(String v){email=v;}
public String getPhone(){return phone;} public void setPhone(String v){phone=v;}
public String getAddress(){return address;} public void setAddress(String v){address=v;}
public String getCity(){return city;} public void setCity(String v){city=v;}}