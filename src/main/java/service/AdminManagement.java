package service;

import model.Course;
import model.Student;

public class AdminManagement {

  private StudentManagement studentManagement;
  private CourseManagement courseManagement;

  public AdminManagement(StudentManagement studentManagement, CourseManagement courseManagement) {
    this.studentManagement = studentManagement;
    this.courseManagement = courseManagement;
  }

  public void enrollStudentInCourse(Student student, Course course) {
    studentManagement.enrollStudent(student, course);
  }

  public void addNewCourse(Course course) {
    courseManagement.addCourse(course);
  }

  public void assignTrainerToCourse(Course course, model.Trainer trainer) {
    courseManagement.assignTrainerToCourse(course, trainer);
  }
}


