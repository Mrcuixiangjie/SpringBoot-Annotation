package com.example.annotation.service.impl;

import com.example.annotation.pojo.Project;
import com.example.annotation.service.ProjectService;

//
//@Service
public class VegetableImpl implements ProjectService {
    private Project project;
    public VegetableImpl(Project project) {
         this.project=project;
    }
    @Override
    public Project getProject() {
        return this.project;
    }
}
