package service;

import model.Course;

import model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentManagement {
  private List<Student> students = new ArrayList<>();

  public Student createStudent(
      int id, String name, String email, model.Address address, java.util.Date dob) {
    return new Student(id, name, new java.util.Date(), address, email, dob);
  }

  public void addStudent(Student student) {
    students.add(student);
  }

  public void enrollStudent(Student student, Course course) {
    student.enrollInCourse(course);
  }

  public void removeStudent(Student student) {
    students.remove(student);
  }

  public List<Student> getAllStudents() {
    return students;
  }

  public void showAllStudents() {
    for (Student student : students) {
      System.out.print(
          student.getName()
              + " enrolled in "
              + student.getEnrolledCourses().size()
              + " course(s): ");
      for (Course course : student.getEnrolledCourses()) {
        System.out.print(course.getCourseName() + "  ");
      }
      System.out.println();
    }
  }
}
