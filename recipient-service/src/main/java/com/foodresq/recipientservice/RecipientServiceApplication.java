package com.foodresq.recipientservice;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class RecipientServiceApplication {
 public static void main(String[] args){SpringApplication.run(RecipientServiceApplication.class,args);}
}