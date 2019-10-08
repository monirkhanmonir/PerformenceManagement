
package com.exam.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Transfer {
    @Id
    private int id;
    private String name;
    private Date date;
    private String previousPost;
    private String currentPost;
    private int score;
    private String remark;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

  public String getPreviousPost() {
        return previousPost;
    }

    public void setPreviousPost(String previousPost) {
        this.previousPost = previousPost;
    }

    public String getCurrentPost() {
        return currentPost;
    }

    public void setCurrentPost(String currentPost) {
        this.currentPost = currentPost;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "Transfer{" + "id=" + id + ", name=" + name + ", date=" + date + ", previousPost=" + previousPost + ", currentPost=" + currentPost + ", score=" + score + ", remark=" + remark + '}';
    }

  

    
    
    
}
