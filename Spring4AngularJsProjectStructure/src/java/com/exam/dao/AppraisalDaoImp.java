
package com.exam.dao;

import com.exam.model.Appraisal;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AppraisalDaoImp implements AppraisalDaoInterf{
    @Autowired
    SessionFactory sessionFactory;
    @Override
    public Appraisal saveAppraisal(Appraisal appraisal) {
       sessionFactory.getCurrentSession().save(appraisal);
        return null;
    }
    
}
