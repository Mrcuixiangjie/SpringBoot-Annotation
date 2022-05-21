package com.example.annotation.controller;

import com.example.annotation.pojo.Project;
import com.example.annotation.service.ProjectService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@RestController
@Controller
@ResponseBody
@RequestMapping("project")
public class ProjectController {
    @Resource(name = "fruitImpl")
    private ProjectService fruitImpl;
    @Resource(name = "vegetableImpl")
    private ProjectService vegetableImpl;

    @RequestMapping("fruit")
    public Project getFruit(){
        return fruitImpl.getProject();
    }

    @RequestMapping("vege")
    public Project getVegetable(){
        return vegetableImpl.getProject();
    }
}
