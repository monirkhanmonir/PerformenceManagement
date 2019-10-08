
package com.exam.service;

import com.exam.dao.EmployeeDaoInteface;
import com.exam.model.Employee;
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
    
}
