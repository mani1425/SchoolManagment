package model;

import java.util.Date;

public class JobDetails {
  private double salary;
  private String position;
  private String employmentType;
  private Date joiningDate;

  public JobDetails(double salary, String position, String employmentType, Date joiningDate) {
    this.salary = salary;
    this.position = position;
    this.employmentType = employmentType;
    this.joiningDate = joiningDate;
  }

  public void updateSalary(double salary) {
    this.salary = salary;
  }

  public double getSalary() {
    return salary;
  }

  public String getPosition() {
    return position;
  }

  public String getEmploymentType() {
    return employmentType;
  }

  public Date getJoiningDate() {
    return joiningDate;
  }

  @Override
  public String toString() {
    return "Position: " + position + ", Salary: " + salary +
        ", Employment Type: " + employmentType +
        ", Joining Date: " + joiningDate;
  }

}

