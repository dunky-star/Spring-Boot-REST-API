package com.dunky.api.dao;

import com.dunky.api.entity.Employee;

import java.util.List;

public interface EmployeeDAOHibernate {
    public List<Employee> findAll();
    public Employee findById(int theId);
    public void save(Employee theEmployee);
    public void deleteById(int theId);

}
