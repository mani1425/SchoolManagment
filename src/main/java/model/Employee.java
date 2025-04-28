package model;

import java.util.Date;

public  class Employee {
  private String employeeID;
  private String name;
  private String email;
  private String role;
  public EmployeeInformation employeeInformation;
  private Date hireDate;
  private Address address;
  private String contact;

  public Employee(String employeeID,String name, String email,String role)
  {
    this.name =name;
    this.employeeID =employeeID;
    this.email =email;
    this.role =role;
  }
  public String getEmployeeDetails() {
    return "Employee: " + name + ", ID: " + employeeID;
  }
  }
