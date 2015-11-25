package model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by Camunda on 11/11/2015.
 */
@Entity
@Table(name = "USER")
public class User implements Serializable {

    @Id @GeneratedValue
    @Column(name = "USER_ID")
    private int userId;

    @Column(name = "USERNAME")
    private String userName;

    @Column(name = "CREATED_BY")
    private String createdBy;

    @Column(name = "CREATED_DATE")
    private Date createdDate;

    public User() {

    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
}
