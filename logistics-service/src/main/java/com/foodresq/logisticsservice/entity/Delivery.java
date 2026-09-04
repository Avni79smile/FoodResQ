package com.foodresq.logisticsservice.entity; import jakarta.persistence.*;
@Entity @Table(name="deliveries") public class Delivery{
@Id @GeneratedValue(strategy=GenerationType.UUID) private String id; private String donationId;
private String recipientId;
private String matchId;
private String pickupAddress;
private String deliveryAddress;
private String city;
private String assignedDriver;
private String driverPhone;
private java.time.LocalDateTime pickupTime;
private java.time.LocalDateTime actualDeliveryTime;
private String status;
private String notes;
public Delivery(){} public String getId(){return id;} public void setId(String v){id=v;} public String getDonationId(){return donationId;} public void setDonationId(String v){donationId=v;}
public String getRecipientId(){return recipientId;} public void setRecipientId(String v){recipientId=v;}
public String getMatchId(){return matchId;} public void setMatchId(String v){matchId=v;}
public String getPickupAddress(){return pickupAddress;} public void setPickupAddress(String v){pickupAddress=v;}
public String getDeliveryAddress(){return deliveryAddress;} public void setDeliveryAddress(String v){deliveryAddress=v;}
public String getCity(){return city;} public void setCity(String v){city=v;}
public String getAssignedDriver(){return assignedDriver;} public void setAssignedDriver(String v){assignedDriver=v;}
public String getDriverPhone(){return driverPhone;} public void setDriverPhone(String v){driverPhone=v;}
public java.time.LocalDateTime getPickupTime(){return pickupTime;} public void setPickupTime(java.time.LocalDateTime v){pickupTime=v;}
public java.time.LocalDateTime getActualDeliveryTime(){return actualDeliveryTime;} public void setActualDeliveryTime(java.time.LocalDateTime v){actualDeliveryTime=v;}
public String getStatus(){return status;} public void setStatus(String v){status=v;}
public String getNotes(){return notes;} public void setNotes(String v){notes=v;}}