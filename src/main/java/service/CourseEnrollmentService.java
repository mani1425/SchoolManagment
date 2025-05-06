package service;

import java.util.Map;
import java.util.stream.Collectors;
import model.Course;
import model.CourseEnrollment;
import model.Student;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CourseEnrollmentService {
  private List<CourseEnrollment> enrollments = new ArrayList<>();

  public void enroll(Student student, Course course, String adminId) {
    CourseEnrollment enrollment = new CourseEnrollment(student, course, new Date(), "Enrolled", adminId);
    enrollments.add(enrollment);
    System.out.println(" Student '" + student.getName() + "' enrolled in '" + course.getCourseName() + "'");
  }

  public List<CourseEnrollment> getEnrollmentsByStudent(Student student) {
    List<CourseEnrollment> result = new ArrayList<>();
    for (CourseEnrollment ce : enrollments) {
      if (ce.getStudent().equals(student)) {
        result.add(ce);
      }
    }
    return result;
  }

  public List<Student> getStudentsByCourseName(String courseName) {
    List<Student> studentsInCourse = new ArrayList<>();

    for (CourseEnrollment ce : enrollments) {
      if (ce.getCourse().getCourseName().equalsIgnoreCase(courseName)) {
        studentsInCourse.add(ce.getStudent());
      }
    }

    return studentsInCourse;
  }

  public List<Course> getCoursesByStudentName(String studentName) {
    List<Course> courses = new ArrayList<>();

    for (CourseEnrollment enrollment : enrollments) {
      if (enrollment.getStudent().getName().equalsIgnoreCase(studentName)) {
        courses.add(enrollment.getCourse());
      }
    }

    return courses;
  }

  public List<Course> getCoursesWithFewerThanThreeStudents() {
    return enrollments.stream()
        .collect(Collectors.groupingBy(CourseEnrollment::getCourse, Collectors.counting()))
        .entrySet().stream()
        .filter(entry -> entry.getValue() < 3)
        .map(Map.Entry::getKey)
        .collect(Collectors.toList());
  }

  public List<Course> getCoursesWithoutExamForStudent(String studentName) {
    List<Course> result = new ArrayList<>();

    for (CourseEnrollment enrollment : enrollments) {
      if (enrollment.getStudent().getName().equalsIgnoreCase(studentName)
          && !enrollment.isExamHeld()) {
        result.add(enrollment.getCourse());
      }
    }

    return result;
  }

  public void markExamHeld(Student student, Course course) {
    for (CourseEnrollment enrollment : enrollments) {
      if (enrollment.getStudent().getId() == student.getId()
          && enrollment.getCourse().getCourseID() == course.getCourseID()) {
        enrollment.setExamHeld(true);
      }
    }
  }


}
