
package com.exam.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Retirement {
    @Id
    private int eId;
    private String eName;
    private Date employedDate;
    private Date retiredDate;
    private Date lastPromotedDate;
    private String positionLast;
    private int emolument;

    public int geteId() {
        return eId;
    }

    public void seteId(int eId) {
        this.eId = eId;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public Date getEmployedDate() {
        return employedDate;
    }

    public void setEmployedDate(Date employedDate) {
        this.employedDate = employedDate;
    }

    public Date getRetiredDate() {
        return retiredDate;
    }

    public void setRetiredDate(Date retiredDate) {
        this.retiredDate = retiredDate;
    }

    public Date getLastPromotedDate() {
        return lastPromotedDate;
    }

    public void setLastPromotedDate(Date lastPromotedDate) {
        this.lastPromotedDate = lastPromotedDate;
    }

    public String getPositionLast() {
        return positionLast;
    }

    public void setPositionLast(String positionLast) {
        this.positionLast = positionLast;
    }

    public int getEmolument() {
        return emolument;
    }

    public void setEmolument(int emolument) {
        this.emolument = emolument;
    }

    @Override
    public String toString() {
        return "Retirement{" + "eId=" + eId + ", eName=" + eName + ", employedDate=" + employedDate + ", retiredDate=" + retiredDate + ", lastPromotedDate=" + lastPromotedDate + ", positionLast=" + positionLast + ", emolument=" + emolument + '}';
    }
    
}
