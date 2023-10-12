package com.muniz.course.resourses;

import com.muniz.course.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResourses {

    @GetMapping
    public ResponseEntity<User> findAll() {
        User user = new User(1L, "Maelby", "maelby@b.com", "9 9999-9999", "teste");
        return ResponseEntity.ok().body(user);

    }

}
