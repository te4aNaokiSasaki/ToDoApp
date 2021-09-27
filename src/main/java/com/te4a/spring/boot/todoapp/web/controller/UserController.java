package com.te4a.spring.boot.todoapp.web.controller;
import com.te4a.spring.boot.todoapp.domain.entity.Task;
import com.te4a.spring.boot.todoapp.service.TaskService;
import com.te4a.spring.boot.todoapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import com.te4a.spring.boot.todoapp.domain.entity.User;
import javax.annotation.PostConstruct;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Controller
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping(value="/userindex", method=RequestMethod.GET)
    public String index(Model model) {
        List<User> userList = userService.findAll();
        model.addAttribute("users", userList);
        return "userindex";
    }

    //ダミーデータをh2DBに作成
    /*
    @PostConstruct
    public void userInit() {
        User user1 = new User();
        user1.setLoginId("user1id");
        user1.setLoginPasswd("user1pass");
        user1.setName("user1");
        userService.saveAndFlush(user1);

        User user2 = new User();
        user2.setLoginId("user2id");
        user2.setLoginPasswd("user2pass");
        user2.setName("user2");
        userService.saveAndFlush(user2);
    }
     */

}
