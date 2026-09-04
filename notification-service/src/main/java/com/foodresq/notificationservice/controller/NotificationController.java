package com.foodresq.notificationservice.controller; import com.foodresq.notificationservice.Notification;
import com.foodresq.notificationservice.NotificationRepository;
import org.springframework.web.bind.annotation.*; import java.util.*;
@RestController @RequestMapping("notifications") @CrossOrigin public class NotificationController{
private final NotificationRepository repo; public NotificationController(NotificationRepository r){repo=r;}
@GetMapping public List<Notification> all(){return repo.findAll();}
@GetMapping("/{id}") public Notification one(@PathVariable String id){return repo.findById(id).orElseThrow();}
@PostMapping public Notification create(@RequestBody Notification x){return repo.save(x);}
@PutMapping("/{id}") public Notification update(@PathVariable String id,@RequestBody Notification x){x.setId(id);return repo.save(x);}
@DeleteMapping("/{id}") public void delete(@PathVariable String id){repo.deleteById(id);}}