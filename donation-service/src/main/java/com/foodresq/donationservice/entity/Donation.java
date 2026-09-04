package com.foodresq.donationservice.entity; import jakarta.persistence.*;
@Entity @Table(name="donations") public class Donation{
@Id @GeneratedValue(strategy=GenerationType.UUID) private String id; private String donorId;
private String foodName;
private String foodCategory;
private Integer quantity;
private String unit;
private String pickupAddress;
private String city;
private java.time.LocalDateTime expiryTime;
private String status;
public Donation(){} public String getId(){return id;} public void setId(String v){id=v;} public String getDonorId(){return donorId;} public void setDonorId(String v){donorId=v;}
public String getFoodName(){return foodName;} public void setFoodName(String v){foodName=v;}
public String getFoodCategory(){return foodCategory;} public void setFoodCategory(String v){foodCategory=v;}
public Integer getQuantity(){return quantity;} public void setQuantity(Integer v){quantity=v;}
public String getUnit(){return unit;} public void setUnit(String v){unit=v;}
public String getPickupAddress(){return pickupAddress;} public void setPickupAddress(String v){pickupAddress=v;}
public String getCity(){return city;} public void setCity(String v){city=v;}
public java.time.LocalDateTime getExpiryTime(){return expiryTime;} public void setExpiryTime(java.time.LocalDateTime v){expiryTime=v;}
public String getStatus(){return status;} public void setStatus(String v){status=v;}}