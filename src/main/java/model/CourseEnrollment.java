package model;

import java.time.LocalDate;
import java.util.List;
import javax.annotation.processing.Generated;


public class CourseEnrollment {
  private Student student;
  private Course course;
  private LocalDate enrollmentDate;
  private LocalDate examDate;
  private int marks;
  private String status;
  private double attendance;
  private String grade;
  private String remarks;

  public CourseEnrollment(Student student, Course course, LocalDate enrollmentDate) {
    this.student = student;
    this.course = course;
    this.enrollmentDate = enrollmentDate;
    this.status = "Enrolled";
  }

  public void enrollStudent(Student student, Course course) {
    student.enrollInCourse(course);
  }

  public List<Course> findCoursesOfStudent(Student student) {
    return student.getEnrolledCourses();
  }

  public void deEnrollStudent(Student student, Course course) {
    student.dropCourse(course);
  }

  public int getCreditsForStudent(Student student) {
    return student.getTotalCredits();
  }
}
