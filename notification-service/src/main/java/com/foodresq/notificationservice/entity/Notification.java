package com.foodresq.notificationservice.entity; import jakarta.persistence.*;
@Entity @Table(name="notifications") public class Notification{
@Id @GeneratedValue(strategy=GenerationType.UUID) private String id; private String userId;
private String userType;
private String title;
private String message;
private String type;
private String relatedId;
private boolean readStatus;
public Notification(){} public String getId(){return id;} public void setId(String v){id=v;} public String getUserId(){return userId;} public void setUserId(String v){userId=v;}
public String getUserType(){return userType;} public void setUserType(String v){userType=v;}
public String getTitle(){return title;} public void setTitle(String v){title=v;}
public String getMessage(){return message;} public void setMessage(String v){message=v;}
public String getType(){return type;} public void setType(String v){type=v;}
public String getRelatedId(){return relatedId;} public void setRelatedId(String v){relatedId=v;}
public boolean getReadStatus(){return readStatus;} public void setReadStatus(boolean v){readStatus=v;}}