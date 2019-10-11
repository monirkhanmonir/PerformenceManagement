
package com.exam.service;

import com.exam.dao.AppraisalDaoInterf;
import com.exam.model.Appraisal;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class AppraisalSer implements AppraisalInterface {
    @Autowired
    AppraisalDaoInterf appraisalDaoInterf;
    @Override
    public Appraisal saveAppraisal(Appraisal appraisal) {
  
        appraisalDaoInterf.saveAppraisal(appraisal);
        return null;
    }

    @Override
    public Appraisal getById(int id) {
        System.out.println("Call Appraisal service");
      return appraisalDaoInterf.getById(id);
    }
    
}
