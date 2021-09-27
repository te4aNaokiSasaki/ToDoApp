package com.te4a.spring.boot.todoapp.domain.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="task")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "taskIdGenerator")
    @SequenceGenerator(name = "taskIdGenerator", sequenceName = "taskIdSeq")
    @Column
    private int id;

    @Column(length = 30, nullable = false)
    private String taskName;

    @Column(nullable = false)
    private String status;

    @Column(nullable = false)
    private Date createDate;

    @Column(nullable = true)
    private Date finishDate;

    @ManyToOne
    private User user;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String setStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(Date finishDate) {
        this.finishDate = finishDate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
