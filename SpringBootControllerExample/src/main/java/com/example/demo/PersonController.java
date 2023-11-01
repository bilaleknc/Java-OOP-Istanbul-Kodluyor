package com.example.demo;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/persons")
public class PersonController {
    //In-Memory DB
    private List<Person> personList = new ArrayList<>();

    @GetMapping
    public List<Person> getAll(){
        return personList;
    }

    @GetMapping("{id}")
    public void getById(@PathVariable int id){
        //Araştırma Konusu
        // stream Api
    }

    @PostMapping
    public void add(@RequestBody Person person){
        personList.add(person);
        System.out.println("Eklendi.");
    }

}
