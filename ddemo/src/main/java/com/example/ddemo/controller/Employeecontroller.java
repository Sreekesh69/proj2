package com.example.ddemo.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ddemo.model.Employee;
import com.example.ddemo.repository.EmployeeRepository;

@RestController
@RequestMapping("/api")

public class Employeecontroller {
    
    @Autowired
    EmployeeRepository employeeRepository;

    @PostMapping("/Employee")
    public ResponseEntity<String> saveEmployee(@RequestBody List<Employee> empData){
    employeeRepository.saveAll(empData);
    return ResponseEntity.ok("Data Saved");

     @PutMapping("/update/{id}")
       public ResponseEntity<?> add(@PathVariable("id") Long id,@RequestBody Employee employee){
        employeeService.update(id,employee);
        return new ResponseEntity<>("Saved", HttpStatus.OK);
       }

       @DeleteMapping("/Delete/{id}")
       public ResponseEntity<?> delete(@PathVariable("id") Long id){
        employeeService.delete(id);
         return new ResponseEntity<>("Deleted", HttpStatus.OK);
       }
    @GetMapping("getby/{id}")
    public ResponseEntity<?> getById(@PathVariable("id") Long id){
       Optional<Employee> list =  employeeService.getById(id);
        return new ResponseEntity<>(list, HttpStatus.OK);
}
}
