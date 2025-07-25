/***************************************************************
 * Author       :	 
 * Created Date :	
 * Version      : 	
 * History  :	
 * *************************************************************/
package com.example.demo.controller;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * HomeController Class.
 * <p>
 * </p>
 *
 * @author
 */

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {

    private final EmployeeService service;

    public EmployeeController(EmployeeService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<Employee>> getAllEmployee(){
        List<Employee> list = service.findAll();
        return new ResponseEntity<>(list,HttpStatus.OK);
    }


    @PostMapping
    public String saveEmployee(@RequestBody List<Employee> employee){
        service.save(employee);
        return "Employee is saved.";
    }
}
