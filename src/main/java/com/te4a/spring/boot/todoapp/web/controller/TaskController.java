package com.te4a.spring.boot.todoapp.web.controller;

import com.te4a.spring.boot.todoapp.domain.entity.User;
import com.te4a.spring.boot.todoapp.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.te4a.spring.boot.todoapp.domain.entity.Task;
import javax.annotation.PostConstruct;
import java.util.Calendar;
import java.util.Date;
import java.util.List;


@Controller
public class TaskController {
    @Autowired
    TaskService taskService;

    @RequestMapping(value="/index", method=RequestMethod.GET)
    public String index(Model model) {
        List<Task> taskList = taskService.findAll();
        model.addAttribute("tasks", taskList);
        return "index";
    }
    /*
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
        taskService.saveAndFlush(task1);
    }

     */

}
