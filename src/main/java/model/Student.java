package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Student {
  private int studentID;
  private String name;
  private Date dateOfEnrollment;
  private Address address;
  private String email;
  private Date dateOfBirth;
  private List<Course> enrolledCourses = new ArrayList<>();

  public Student(int studentID, String name, Date dateOfEnrollment, Address address, String email, Date dateOfBirth) {
    this.studentID = studentID;
    this.name = name;
    this.dateOfEnrollment = dateOfEnrollment;
    this.address = address;
    this.email = email;
    this.dateOfBirth = dateOfBirth;
  }
  public String getName() {
    return name;
  }
  public void enrollInCourse(Course course) {
    enrolledCourses.add(course);
  }

  public void dropCourse(Course course) {
    enrolledCourses.remove(course);
  }

  public List<Course> getEnrolledCourses() {
    return enrolledCourses;
  }

  public int getTotalCredits() {
    return enrolledCourses.stream().mapToInt(Course::getCredits).sum();
  }
}
