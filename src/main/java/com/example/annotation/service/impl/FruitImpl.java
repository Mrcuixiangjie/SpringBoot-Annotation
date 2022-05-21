package com.example.annotation.service.impl;

import com.example.annotation.pojo.Project;
import com.example.annotation.service.ProjectService;
import org.springframework.stereotype.Service;

//@Service
public class FruitImpl implements ProjectService {
    private Project project;
    public FruitImpl(Project project) {
          this.project=project;
    }
    @Override
    public Project getProject() {
        return this.project;
    }
}
