package com.teste.first_springapp.controler;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController 
@RequestMapping("/")
public class Hellocontroller {
    
    @GetMapping("/get")
    @ResponseStatus(HttpStatus.OK)

    public String HelloWorld(@RequestParam ("name") String name){
        return "Hello World " + name;
    } 

    @PostMapping("/post")
    public String Post(@RequestBody String body){
        return "Dados: " + body;
    }
}

