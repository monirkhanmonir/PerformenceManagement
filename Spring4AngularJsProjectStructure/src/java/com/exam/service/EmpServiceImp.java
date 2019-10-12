
package com.exam.service;

import com.exam.dao.EmployeeDaoInteface;
import com.exam.model.Employee;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class EmpServiceImp implements EmpService<Employee>{

    @Autowired
    EmployeeDaoInteface employeeDaoInteface;
    
    @Override
    public void saveUser(Employee emp) {
        
        employeeDaoInteface.saveUser(emp);
    }

    @Override
    public List<Employee> getAllEmployee() {
        System.out.println("Call Service");
                
       return employeeDaoInteface.getAllEmployee();
    }

    @Override
    public Employee getById(int id) {
        System.out.println("Call service get id");
      return employeeDaoInteface.getById(id);
    }

    @Override
    public void deleteEmp(int id) {
        System.out.println("delete Sercive calll");
        employeeDaoInteface.deleteEmp(id);
    }
    
}
