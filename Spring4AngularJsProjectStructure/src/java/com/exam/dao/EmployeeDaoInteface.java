
package com.exam.dao;

import com.exam.model.Employee;
import java.util.List;



public interface EmployeeDaoInteface <T>{
    public void saveUser(T emp);
    public List<Employee> getAllEmployee();
    public Employee getById(int id);
}
