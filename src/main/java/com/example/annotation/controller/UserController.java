package com.example.annotation.controller;

import com.example.annotation.pojo.User;
import com.example.annotation.service.UserService;
import com.example.annotation.service.impl.UserServiceImpl;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
   
    @RequestMapping("/user/{id}/{name}")
    public User getUser(@PathVariable(value = "id",required = false)int id,
                        @PathVariable(value = "name",required = false)String name){
          User user = new User();
          user.setId(id);
          user.setAge(26);
          user.setName(name);
          user.setSex(true);
          return user;
    }
}
@Controller
@ResponseBody
class ControllerAndRestController{
    @Resource
    private UserService userService;
    @PostMapping("/controller")
    public User getUser(@RequestBody User user){
        return userService.getUserById(user.getId());
    }
}