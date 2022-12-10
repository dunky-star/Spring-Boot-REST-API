package com.dunky.api.rest;

import com.dunky.api.dao.EmployeeDAOHibernate;
import com.dunky.api.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class RestApiController {

    private EmployeeDAOHibernate employeeDAO;
    // Inject Employee DAO
    @Autowired
    public RestApiController(EmployeeDAOHibernate theEmployeeDao){
        this.employeeDAO = theEmployeeDao;
    }
    // Expose a new end-point for "employees" (use constructor injection).
    @GetMapping("/employees")
    public List<Employee> findAll(){
        return employeeDAO.findAll();
    }


}
