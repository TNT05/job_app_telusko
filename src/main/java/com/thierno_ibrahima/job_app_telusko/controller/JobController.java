package com.thierno_ibrahima.job_app_telusko.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.thierno_ibrahima.job_app_telusko.model.JobPost;
import com.thierno_ibrahima.job_app_telusko.service.JobService;






@Controller
@CrossOrigin
public class JobController {

  @Autowired
  private JobService jobService;

  @GetMapping({"/", "home"})
  public String home() {
    return "home";
  }

  @GetMapping("addjob")
  public String addJob() {
      return "addjob";
  }

  @PostMapping("handleForm")
  public String handleForm(JobPost jobPost, Model model) {
      model.addAttribute("jobPost", jobPost);
      jobService.addJob(jobPost);
      return "success";
  }
  
  @GetMapping("viewalljobs")
  public String viewAllJobs(Model model) {
    
    List<JobPost> jobPosts = jobService.findAll();
    
    model.addAttribute("jobPosts", jobPosts);
    
    return "viewalljobs";
  }
  
  
}
