package model;

import java.util.Date;
import java.util.List;

import java.util.List;

public class EmployeeInformation {
  private Address address;
  private PersonalDetails personalDetails;
  private JobDetails jobDetails;
  private List<String> skills;

  public EmployeeInformation(Address address, PersonalDetails personalDetails, JobDetails jobDetails, List<String> skills) {
    this.address = address;
    this.personalDetails = personalDetails;
    this.jobDetails = jobDetails;
    this.skills = skills;
  }

  public void updateSalary(double newSalary) {
    jobDetails.updateSalary(newSalary);
  }

  public String getFullPersonalDetails() {
    return personalDetails.getPersonalDetails();
  }

  public String getFullProfessionalDetails() {
    return jobDetails.getProfessionalDetails();
  }

}