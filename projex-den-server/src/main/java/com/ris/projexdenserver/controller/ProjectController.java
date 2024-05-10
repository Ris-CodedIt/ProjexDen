package com.ris.projexdenserver.controller;

import com.ris.projexdenserver.domain.Project;
import com.ris.projexdenserver.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProjectController {
    @Autowired
    private ProjectService service;

    @PostMapping("/projects")
    public Project addProject(@RequestBody Project project){
        return  service.addProject(project);
    }
    @GetMapping("/projects")
    public List<Project> allProject(){
        return  service.getProjects();
    }
    @GetMapping("/projects/{project_id}")
    public Project singleProject(@PathVariable(name = "project_id") Long id){
        return  service.getProjectById(id);
    }
}
