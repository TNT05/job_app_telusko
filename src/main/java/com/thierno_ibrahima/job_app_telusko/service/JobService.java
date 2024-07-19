package com.thierno_ibrahima.job_app_telusko.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.thierno_ibrahima.job_app_telusko.model.JobPost;
import com.thierno_ibrahima.job_app_telusko.repository.JobRepository;

@Service
@Component
public class JobService {

  @Autowired
  private JobRepository jobRepository;
  
  public void addJob(JobPost jobPost){
    //System.out.println("there tho");
    jobRepository.addJob(jobPost);
  }

  public List<JobPost> findAll(){
    return jobRepository.findAll();
  }
  
}
