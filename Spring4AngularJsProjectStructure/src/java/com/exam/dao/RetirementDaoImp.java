
package com.exam.dao;

import com.exam.model.Retirement;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RetirementDaoImp implements RetirementDaoInterF{
    @Autowired
    SessionFactory sessionFactory;
    @Override
    public Retirement saveRetirement(Retirement retirement) {
        sessionFactory.getCurrentSession().save(retirement);
        System.out.println("Dao sess");
        return null;
    }
    
}
