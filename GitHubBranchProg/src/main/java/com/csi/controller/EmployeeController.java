package com.csi.controller;

import com.csi.model.Employee;
import com.csi.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    EmployeeRepo employeeRepoImpl;

    @PostMapping("/save")
    public ResponseEntity<Employee> saveData(@RequestBody Employee employee) {
        return ResponseEntity.ok(employeeRepoImpl.save(employee));
    }

    @GetMapping("/getalldata")
    public ResponseEntity<List<Employee>> getAllData(){
        return ResponseEntity.ok(employeeRepoImpl.findAll());

    }
}
