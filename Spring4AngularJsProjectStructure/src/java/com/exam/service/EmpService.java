
package com.exam.service;

import com.exam.model.Employee;
import java.util.List;

public interface EmpService <T>{
    
    public void saveUser(T emp);
    public List<Employee> getAllEmployee();
    public Employee getById(int id);
}
