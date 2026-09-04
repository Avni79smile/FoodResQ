package com.foodresq.recipientservice.entity; import jakarta.persistence.*;
@Entity @Table(name="recipients") public class Recipient{
@Id @GeneratedValue(strategy=GenerationType.UUID) private String id; private String name;
private String email;
private String phone;
private String address;
private String city;
private String foodCategory;
private Integer quantityRequired;
private String urgencyLevel;
private String status;
public Recipient(){} public String getId(){return id;} public void setId(String v){id=v;} public String getName(){return name;} public void setName(String v){name=v;}
public String getEmail(){return email;} public void setEmail(String v){email=v;}
public String getPhone(){return phone;} public void setPhone(String v){phone=v;}
public String getAddress(){return address;} public void setAddress(String v){address=v;}
public String getCity(){return city;} public void setCity(String v){city=v;}
public String getFoodCategory(){return foodCategory;} public void setFoodCategory(String v){foodCategory=v;}
public Integer getQuantityRequired(){return quantityRequired;} public void setQuantityRequired(Integer v){quantityRequired=v;}
public String getUrgencyLevel(){return urgencyLevel;} public void setUrgencyLevel(String v){urgencyLevel=v;}
public String getStatus(){return status;} public void setStatus(String v){status=v;}}