package com.example.annotation.cfg;

import com.example.annotation.pojo.Project;
import com.example.annotation.service.ProjectService;
import com.example.annotation.service.impl.FruitImpl;
import com.example.annotation.service.impl.UserServiceImpl;
import com.example.annotation.service.impl.VegetableImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyBeans {
     @Bean
    public ProjectService vegetableImpl(){
         return new VegetableImpl(new Project(1,"白菜",100));
     }
     @Bean
     public ProjectService fruitImpl(){
         return new FruitImpl(new Project(2,"香蕉",300));
     }
}
