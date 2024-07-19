package com.thierno_ibrahima.job_app_telusko.model;

import java.util.List;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//Lombok allows to generate automatically some constructor and getters/setters
@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class JobPost {
  private int postId;
  private String postProfile;
  private String postDesc;
  private int reqExperience;
  private List<String> postTechStack;
}
