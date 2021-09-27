package com.te4a.spring.boot.todoapp.web.controller;

import com.te4a.spring.boot.todoapp.domain.entity.Task;
import com.te4a.spring.boot.todoapp.service.TaskService;
import com.te4a.spring.boot.todoapp.domain.entity.User;
import com.te4a.spring.boot.todoapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class IndexController {
    @Autowired
    TaskService taskService;
    @Autowired
    UserService userService;

    @RequestMapping(value="/index", method= RequestMethod.GET)
    public String index(Model model) {
        List<Task> taskList = taskService.findAll();
        List<User> userList = userService.findAll();

        model.addAttribute("tasks", taskList);
        return "index";
    }
}
