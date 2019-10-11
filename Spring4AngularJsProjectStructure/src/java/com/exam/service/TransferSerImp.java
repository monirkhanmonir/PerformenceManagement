
package com.exam.service;

import com.exam.dao.TransferDaoInterF;
import com.exam.model.Transfer;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
@Transactional
public class TransferSerImp implements TranesferSerInterF{
    @Autowired
    TransferDaoInterF transferDaoInterF;
    @Override
    public Transfer saveTransfer(Transfer transfer) {
       
        transferDaoInterF.saveTransfer(transfer);
        return null;
    }

    @Override
    public Transfer getById(int id) {
        System.out.println("Call Transfer Service");
     return transferDaoInterF.getById(id);
    }
    
}
