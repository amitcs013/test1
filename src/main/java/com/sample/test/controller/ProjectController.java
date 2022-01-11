package com.sample.test.controller;

import com.sample.test.model.Project;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class ProjectController {

    Logger log = LoggerFactory.getLogger(ProjectController.class);
    @RequestMapping(value = "/project", method = RequestMethod.GET)
    public Project getProject(){

        Project prj = getProjectData();
        log.info("Project Data: Name - "+prj.getName()+ " Id -" + prj.getId()+ " Description -"+prj.getDescription());
        return prj;

    }

    private Project getProjectData(){

        Project project = new Project();
        project.setDescription("Project Description");
        project.setId("12345");
        project.setName("Test Project");

        return project;
    }

}
