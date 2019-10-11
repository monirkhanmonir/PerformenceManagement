
package com.exam.service;

import com.exam.model.Appraisal;

public interface AppraisalInterface {
    public Appraisal saveAppraisal(Appraisal appraisal);
    public Appraisal getById(int id);
}
