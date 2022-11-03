package com.dunky.api.dao;

import com.dunky.api.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    public List<Employee> findAll();
}
