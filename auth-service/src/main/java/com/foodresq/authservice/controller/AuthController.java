package com.foodresq.authservice.controller; import com.foodresq.authservice.entity.User; import com.foodresq.authservice.repository.UserRepository; import org.springframework.web.bind.annotation.*; import org.springframework.http.*;
@RestController @RequestMapping("/auth") @CrossOrigin public class AuthController{
private final UserRepository repo; public AuthController(UserRepository r){repo=r;}
@PostMapping("/register") public ResponseEntity<?> register(@RequestBody User u){if(repo.findByEmail(u.getEmail()).isPresent())return ResponseEntity.status(409).body("Email already exists");return ResponseEntity.ok(repo.save(u));}
@PostMapping("/login") public ResponseEntity<?> login(@RequestBody User u){return repo.findByEmail(u.getEmail()).filter(x->x.getPassword().equals(u.getPassword())).map(ResponseEntity::ok).orElse(ResponseEntity.status(401).body(null));}
}