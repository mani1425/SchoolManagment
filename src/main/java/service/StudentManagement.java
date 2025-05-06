package service;


import model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentManagement {

  private final List<Student> students = new ArrayList<>();

  public Student createStudent(int id, String name, String email, model.Address address, java.util.Date dob) {
    return new Student(id, name, new java.util.Date(), address, email, dob);
  }


  public void addStudent(Student student) {
    students.add(student);
  }


  public void showAllStudents() {
    for (Student s : students) {
      System.out.println(s.getName() + " - " + s.getEmail());
    }
  }


  public Student getStudentById(int id) {
    for (Student s : students) {
      if (s.getId() == id) return s;
    }
    return null;
  }


  public List<Student> getAllStudents() {
    return students;
  }
}
