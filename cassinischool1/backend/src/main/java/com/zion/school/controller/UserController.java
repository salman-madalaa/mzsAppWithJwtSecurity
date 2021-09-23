package com.zion.school.controller;

import com.zion.school.core.BaseController;
import com.zion.school.model.security.User;
import com.zion.school.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * Created by Lenovo on 20-09-2021.
 */
@RestController
@RequestMapping(value = "user")
public class UserController extends BaseController {

    @Autowired
    private UserService userService;

    @PostConstruct
    public void initRoleAndUsers(){
        userService.initRoleAndUser();
    }

    @RequestMapping(value = "/new",method = RequestMethod.POST)
    public User createUser(@RequestBody User user){
        return  userService.createNewUser(user);
    }

    @RequestMapping(value = "/all",method = RequestMethod.GET)
    public List<User> gtAll(){
        return  userService.getAll();
    }

}
