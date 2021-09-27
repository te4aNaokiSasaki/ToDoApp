package com.te4a.spring.boot.todoapp.web.controller;

import com.te4a.spring.boot.todoapp.domain.entity.*;
import com.te4a.spring.boot.todoapp.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Controller
public class CreateDummyDataController {
    @Autowired
    TaskService taskService;
    @Autowired
    UserService userService;

    @RequestMapping(value="/home", method= RequestMethod.GET)
    public String index(Model model) {
        return "home";
    }

    @PostConstruct
    public void taskInit() {
        Date date = new Date();
        Task task1 = new Task();
        task1.setTaskName("testTask1");
        task1.setStatus("standby");
        task1.setCreateDate(date);
        taskService.saveAndFlush(task1);

        Task task2 = new Task();
        task2.setTaskName("testTask2");
        task2.setStatus("standby");
        task2.setCreateDate(date);
        taskService.saveAndFlush(task2);

        User user1 = new User();
        user1.setLoginId("user1id");
        user1.setLoginPasswd("user1pass");
        user1.setName("user1");
        user1.setTasks(Arrays.asList(task1));
        userService.saveAndFlush(user1);

        User user2 = new User();
        user2.setLoginId("user2id");
        user2.setLoginPasswd("user2pass");
        user2.setName("user2");
        user2.setTasks(Arrays.asList(task2));
        userService.saveAndFlush(user2);

    }

}

