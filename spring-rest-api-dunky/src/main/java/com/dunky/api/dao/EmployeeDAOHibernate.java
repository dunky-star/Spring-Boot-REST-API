package com.dunky.api.dao;

import com.dunky.api.entity.Employee;

import java.util.List;

public interface EmployeeDAOHibernate {
    public List<Employee> findAll();
}
