package com.ris.projexdenserver.service;

import com.ris.projexdenserver.domain.Project;
import com.ris.projexdenserver.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService {
    @Autowired
     private ProjectRepository repo;

    public Project addProject(Project project) {
        return repo.save(project);
    }

    public List<Project> getProjects() {
        return repo.findAll();
    }

    public Project getProjectById(Long id) {
        return repo.findById(id).orElse(new Project());
    }
}
