package com.te4a.spring.boot.todoapp.domain.entity;

import javax.persistence.*;
import java.util.List;
import com.te4a.spring.boot.todoapp.domain.entity.Task;

@Entity
@Table(name="user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "userIdGenerator")
    @SequenceGenerator(name = "userIdGenerator", sequenceName = "userIdSeq")
    @Column
    private int id;
    //@GeneratedValue、@SequenceGeneratorはダミーデータ生成時にIDをautInclementするシークエンス

    @Column(length = 30, nullable = false)
    private String loginId;

    @Column(length = 30, nullable = false)
    private String loginPasswd;

    @Column(length = 30, nullable = false)
    private String name;

    @OneToMany(mappedBy="user")
    private List<Task> tasks;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getLoginPasswd() {
        return loginPasswd;
    }

    public void setLoginPasswd(String loginPasswd) {
        this.loginPasswd = loginPasswd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

    private List<Task> getTasks(){
        return tasks;
    }

    /*getterを呼び出し*/
    public List<Task> acquireTasks(){
        return getTasks();
    }
}