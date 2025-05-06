package model;


public class Trainer {
  private String trainerID;
  private EmployeeInformation employeeInformation;
  private String specialization;

  public Trainer(String trainerID, EmployeeInformation employeeInformation, String specialization) {
    this.trainerID = trainerID;
    this.employeeInformation = employeeInformation;
    this.specialization = specialization;
  }
  public String getTrainerName() {
    return this.employeeInformation.getName();
  }

  public String getSpecialization() {
    return specialization;
  }

  public EmployeeInformation getEmployeeInformation() {
    return employeeInformation;
  }
}


