
package com.exam.dao;

import com.exam.model.Transfer;

public interface TransferDaoInterF {
    public Transfer saveTransfer(Transfer transfer);
    public Transfer getById(int id);
}
