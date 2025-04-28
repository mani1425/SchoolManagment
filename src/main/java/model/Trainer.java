package model;


public class Trainer {
  private String trainerID;
  private EmployeeInformation employeeInformation; // Trainer IS an Employee
  private String specialization;

  public Trainer(String trainerID, EmployeeInformation employeeInformation, String specialization) {
    this.trainerID = trainerID;
    this.employeeInformation = employeeInformation;
    this.specialization = specialization;
  }

  public String getTrainerName() {
    return this.employeeInformation.getFullPersonalDetails(); // From Employee
  }

  public String getSpecialization() {
    return specialization;
  }

  public EmployeeInformation getEmployeeInformation() {
    return employeeInformation;
  }
}


