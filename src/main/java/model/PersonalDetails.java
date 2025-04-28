package model;

import java.util.Date;

public class PersonalDetails {
  private String phoneNumber;
  private String emergencyContact;
  private Date dateOfBirth;

  public PersonalDetails(String phoneNumber, String emergencyContact, Date dateOfBirth) {
    this.phoneNumber = phoneNumber;
    this.emergencyContact = emergencyContact;
    this.dateOfBirth = dateOfBirth;
  }
  public String getPersonalDetails() {
    return "DOB: " + dateOfBirth + ", Emergency Contact: " + emergencyContact;
  }

}

