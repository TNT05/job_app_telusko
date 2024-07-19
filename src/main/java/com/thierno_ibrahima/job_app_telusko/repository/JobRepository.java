package com.thierno_ibrahima.job_app_telusko.repository;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.thierno_ibrahima.job_app_telusko.model.JobPost;

@Repository
public class JobRepository {
  
  private List<JobPost> jobs = new ArrayList<JobPost>(Arrays.asList(
    new JobPost(1, "Java Developer", "Knowledge in springboot", 5, Arrays.asList("Java", "Spring")),
    new JobPost(2, "Python Developer", "Knowledge in ML", 10, Arrays.asList("Java", "Spring")),
    new JobPost(3, "Full Stack Developer", "Knowledge in React and Node", 8, Arrays.asList("React", "Node", "Java", "Spring")),
    new JobPost(4, "Database", "Knowledge in Sql", 8, List.of("sql", "mongodb"))
  ));

  public List<JobPost> findAll(){
    return jobs;
  }

  public void addJob(JobPost job){
    //System.out.println("here tho");
    jobs.add(job);
  }


}
