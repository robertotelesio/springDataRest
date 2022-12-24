package it.academy.corso.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class NomeController {

    @GetMapping("/stampanome")
    public ResponseEntity<String> stampanome() {
        String message = "roberto ";
        return new ResponseEntity<>(message, HttpStatus.OK);
    }

}
