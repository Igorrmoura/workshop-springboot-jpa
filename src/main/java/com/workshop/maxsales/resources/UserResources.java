package com.workshop.maxsales.resources;


import com.workshop.maxsales.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/Users")
public class UserResources {

    @GetMapping
    public ResponseEntity<User> findAll() {
        User u = new User(1l,"Maria", "maria@gmail.com", "9999999", "12345");
        return  ResponseEntity.ok().body(u);
    }
}
