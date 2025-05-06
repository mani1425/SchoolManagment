package model;

import java.util.Date;
import java.util.List;

import java.util.List;

public class EmployeeInformation {
  private String name;
  private Address address;
  private PersonalDetails personalDetails;
  private JobDetails jobDetails;
  private List<String> skills;

  public EmployeeInformation(String name,Address address, PersonalDetails personalDetails, JobDetails jobDetails, List<String> skills) {
    this.address = address;
    this.personalDetails = personalDetails;
    this.jobDetails = jobDetails;
    this.skills = skills;
  }

  public void updateSalary(double newSalary) {
    jobDetails.updateSalary(newSalary);
  }

  public PersonalDetails getPersonalDetails() {
    return personalDetails;
  }

  public String getFullProfessionalDetails() {
    return jobDetails.toString();
  }

  public JobDetails getJobDetails() {
    return jobDetails;
  }

  public List<String> getSkills() {
    return skills;
  }

  public String getName() {
    return name;
  }


}