package Controller;

import model.Course;
import model.Student;
import service.CourseEnrollmentService;
import service.CourseManagement;
import service.StudentManagement;

public class AdminService {

  private StudentManagement studentManagement;
  private CourseManagement courseManagement;

  private final CourseEnrollmentService enrollmentService;

  public AdminService(
      StudentManagement studentManagement,
      CourseManagement courseManagement,
      CourseEnrollmentService enrollmentService) {
    this.studentManagement = studentManagement;
    this.courseManagement = courseManagement;
    this.enrollmentService = enrollmentService;
  }

  public void enrollStudentInCourse(Student student, Course course, String adminId) {
    enrollmentService.enroll(student, course, adminId);

  }
  }