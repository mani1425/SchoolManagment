package model;

import java.util.Date;

public class Student {
  private int id;
  private String name;
  private Date registrationDate;
  private Address address;
  private String email;
  private Date dateOfBirth;

  public Student(int id, String name, Date registrationDate, Address address, String email, Date dateOfBirth) {
    this.id = id;
    this.name = name;
    this.registrationDate = registrationDate;
    this.address = address;
    this.email = email;
    this.dateOfBirth = dateOfBirth;
  }

  public String getName() {
    return name;
  }

  public int getId() {
    return id;
  }

  public Address getAddress() {
    return address;
  }

  public String getEmail() {
    return email;
  }

  public Date getDateOfBirth() {
    return dateOfBirth;
  }
}
