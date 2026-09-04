package com.foodresq.recipientservice.repository; import com.foodresq.recipientservice.Recipient;
import org.springframework.data.jpa.repository.JpaRepository;
public interface RecipientRepository extends JpaRepository<Recipient,String>{}