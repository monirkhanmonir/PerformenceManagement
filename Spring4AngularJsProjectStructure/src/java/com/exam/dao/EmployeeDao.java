
package com.exam.dao;

import com.exam.model.Employee;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDao implements EmployeeDaoInteface<Employee>{ 
    @Autowired
    SessionFactory sessionFactory;
    @Override
    public void saveUser(Employee emp) {
        
        sessionFactory.getCurrentSession().save(emp);
    }
    
}
