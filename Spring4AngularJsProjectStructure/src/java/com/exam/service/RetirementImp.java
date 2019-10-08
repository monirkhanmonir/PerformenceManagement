
package com.exam.service;

import com.exam.dao.RetirementDaoInterF;
import com.exam.model.Retirement;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
@Transactional
public class RetirementImp implements RetirementInterF{
    @Autowired
    RetirementDaoInterF retirementDaoInterF;
    @Override
    public Retirement saveRetirement(Retirement retirement) {
        System.out.println("Ret serv");
        System.out.println(retirement.geteName());
        retirementDaoInterF.saveRetirement(retirement);
        
        return null;
    }
    
}
