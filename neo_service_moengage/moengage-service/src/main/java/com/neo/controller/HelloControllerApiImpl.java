package com.neo.controller;

import com.neo.model.Greeting;
import com.neo.spec.api.HelloOpenApi;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControllerApiImpl implements HelloOpenApi {

    @Override
    public ResponseEntity<Greeting> getGreeting(){
      // TODO document why this method is empty
        Greeting greeting = new Greeting();
        greeting.message("Hello from Spring Boot");
        return ResponseEntity.ok(greeting);
    }

    @Override
    public ResponseEntity<Greeting> getPersonalGreeting(String name) {
        Greeting greeting = new Greeting();
        greeting.message("Hello " + name + ", enjoy Spring Boot");
        return ResponseEntity.ok(greeting);
    }

}
