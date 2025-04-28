package service;

import model.EmployeeInformation;
import java.util.ArrayList;
import java.util.List;

public class EmployeeManagement {
  private List<EmployeeInformation> employees = new ArrayList<>();


  public void addEmployee(EmployeeInformation employeeInfo) {
    employees.add(employeeInfo);
  }

  public void updateEmployeeSalary(EmployeeInformation employeeInfo, double newSalary) {
    employeeInfo.updateSalary(newSalary);
  }

  public void showAllEmployees() {
    for (EmployeeInformation emp : employees) {
      System.out.println(emp.getFullPersonalDetails() + " | " + emp.getFullProfessionalDetails());
    }
  }

  public List<EmployeeInformation> getAllEmployees() {
    return employees;
  }
}
