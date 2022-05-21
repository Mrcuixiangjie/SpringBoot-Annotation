package com.example.annotation.controller;

import com.example.annotation.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserControllerView {
    @RequestMapping("/index/{id}")
    public ModelAndView getView(@PathVariable(value = "id",required = false)int id){
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("id",id);
        return modelAndView;
    }
    @GetMapping
    public ModelAndView getViewThree(@PathVariable(value = "id",required = false)String id){
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("id",2000);
        return modelAndView;
    }
    @GetMapping("/get/{id}")
    public ModelAndView getViewFour(@PathVariable(value = "id",required = false)String id){
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("id",id);
        return modelAndView;
    }
    @GetMapping("/getTwo")
    public ModelAndView getViewFive(@RequestParam(value ="id",defaultValue = "0",required = false)int id){
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("id",id);
        return modelAndView;
    }
    @PostMapping
    public ModelAndView getViewTwo(@PathVariable(value = "id",required = false)String id){
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("id",1000);
        return modelAndView;
    }
    @PostMapping("/post/{id}")
    public ModelAndView getViewSix(@PathVariable(value = "id",required = false)String id){
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("id",id);
        return modelAndView;
    }
    @PostMapping("/post")
    public ModelAndView getViewSeven(@RequestParam(value ="id",defaultValue = "0",required = false)int id){
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("id",id);
        return modelAndView;
    }
    @PostMapping("/post/t")
    public ModelAndView getViewEight(@RequestBody String  id){
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("id",id);
        return modelAndView;
    }
    @PostMapping("/post/b")
    public ModelAndView getViewTen(@RequestBody User user){
        ModelAndView modelAndView = new ModelAndView("multiArguments");
        modelAndView.addObject("user",user);
        return modelAndView;
    }
    @PostMapping("/post/h")
    public ModelAndView getViewNine(@RequestHeader int id){
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("id",id);
        return modelAndView;
    }
}
