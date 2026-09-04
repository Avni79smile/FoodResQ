package com.foodresq.logisticsservice.controller; import com.foodresq.logisticsservice.Delivery;
import com.foodresq.logisticsservice.DeliveryRepository;
import org.springframework.web.bind.annotation.*; import java.util.*;
@RestController @RequestMapping("deliveries") @CrossOrigin public class DeliveryController{
private final DeliveryRepository repo; public DeliveryController(DeliveryRepository r){repo=r;}
@GetMapping public List<Delivery> all(){return repo.findAll();}
@GetMapping("/{id}") public Delivery one(@PathVariable String id){return repo.findById(id).orElseThrow();}
@PostMapping public Delivery create(@RequestBody Delivery x){return repo.save(x);}
@PutMapping("/{id}") public Delivery update(@PathVariable String id,@RequestBody Delivery x){x.setId(id);return repo.save(x);}
@DeleteMapping("/{id}") public void delete(@PathVariable String id){repo.deleteById(id);}}