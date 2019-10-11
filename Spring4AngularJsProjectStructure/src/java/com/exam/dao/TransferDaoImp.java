
package com.exam.dao;

import com.exam.model.Transfer;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class TransferDaoImp implements TransferDaoInterF{
    @Autowired
    SessionFactory sessionFactory;
   
    @Override
    public Transfer saveTransfer(Transfer transfer) {
       sessionFactory.getCurrentSession().save(transfer);
        return null;
    }

    @Override
    public Transfer getById(int id) {
        System.out.println("Call Tarnsfer daw");
     return (Transfer)sessionFactory.getCurrentSession().get(Transfer.class, id);
    }
    
}
