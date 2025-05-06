package model;

import java.util.Date;

public class CourseEnrollment {
  private Student student;
  private Course course;
  private Date enrollmentDate;
  private String status;
  private String enrolledByAdminId;
  private boolean examHeld;

  public CourseEnrollment(Student student, Course course, Date enrollmentDate, String status, String enrolledByAdminId) {
    this.student = student;
    this.course = course;
    this.enrollmentDate = enrollmentDate;
    this.status = status;
    this.enrolledByAdminId = enrolledByAdminId;
    this.examHeld=false;
  }

  public Student getStudent() {
    return student;
  }

  public Course getCourse() {
    return course;
  }

  public Date getEnrollmentDate() {
    return enrollmentDate;
  }


  public boolean isExamHeld() {
    return examHeld;
  }


  public void setExamHeld(boolean examHeld) {
    this.examHeld = examHeld;
  }
}

