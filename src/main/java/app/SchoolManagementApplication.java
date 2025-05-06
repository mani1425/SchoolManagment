package app;

import Controller.AdminService;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import model.Address;
import model.Admin;
import model.Course;
import model.CourseEnrollment;
import model.Employee;
import model.EmployeeInformation;
import model.JobDetails;
import model.PersonalDetails;
import model.Student;
import model.Trainer;
import service.CourseEnrollmentService;
import service.CourseManagement;
import service.EmployeeManagement;
import service.StudentManagement;

public class SchoolManagementApplication {
  public static void main(String[] args) {
    System.out.println("School Management Application Started...\n");

    StudentManagement studentManagement = new StudentManagement();
    EmployeeManagement employeeManagement = new EmployeeManagement();
    CourseManagement courseManagement = new CourseManagement();
    CourseEnrollmentService enrollmentService = new CourseEnrollmentService();
    AdminService adminService = new AdminService(studentManagement, courseManagement, enrollmentService);


    Address address1 = new Address("Alexanderplatz 1", "Berlin", "H-101", "10178", "Germany");
    PersonalDetails pd1 = new PersonalDetails("9123456789", "9876543210", new Date(90, 5, 15));
    JobDetails jd1 = new JobDetails(60000, "Software Engineer", "Full-time", new Date(120, 0, 1));
    EmployeeInformation empInfo1 =
        new EmployeeInformation("Jack",address1, pd1, jd1, Arrays.asList("Java", "Spring Boot"));

    Address address2 = new Address("Kurfürstendamm 26", "Berlin", "H-102", "10719", "Germany");
    PersonalDetails pd2 = new PersonalDetails("9234567890", "9876543211", new Date(91, 2, 1));
    JobDetails jd2 = new JobDetails(55000, "Senior Developer", "Full-time", new Date(121, 3, 1));
    EmployeeInformation empInfo2 =
        new EmployeeInformation("Maxx",address2, pd2, jd2, Arrays.asList("Spring Boot", "Hibernate"));

    Address address3 = new Address("Sonnenallee 40", "Berlin", "H-103", "12045", "Germany");
    PersonalDetails pd3 = new PersonalDetails("9345678901", "9876543212", new Date(92, 7, 1));
    JobDetails jd3 = new JobDetails(50000, "Tester", "Full-time", new Date(122, 5, 1));
    EmployeeInformation empInfo3 =
        new EmployeeInformation("Ulrich",address3, pd3, jd3, Arrays.asList("Selenium", "API Testing"));

    Address address4 = new Address("Schönhauser Allee 80", "Berlin", "H-104", "10439", "Germany");
    PersonalDetails pd4 = new PersonalDetails("9456789012", "9876543213", new Date(93, 8, 10));
    JobDetails jd4 = new JobDetails(52000, "DevOps Engineer", "Full-time", new Date(121, 6, 1));
    EmployeeInformation empInfo4 =
        new EmployeeInformation("Maratha",address4, pd4, jd4, Arrays.asList("AWS", "Docker", "Kubernetes"));

    Address address5 = new Address("Karl-Marx-Strasse 10", "Berlin", "H-105", "12043", "Germany");
    PersonalDetails pd5 = new PersonalDetails("9567890123", "9876543214", new Date(94, 9, 20));
    JobDetails jd5 = new JobDetails(51000, "Support Engineer", "Full-time", new Date(120, 2, 1));
    EmployeeInformation empInfo5 =
        new EmployeeInformation("Muller",address5, pd5, jd5, Arrays.asList("Networking", "Cloud Support"));

    Address address6 = new Address("Friedrichstrasse 90", "Berlin", "H-106", "10969", "Germany");
    PersonalDetails pd6 = new PersonalDetails("9678901234", "9876543215", new Date(95, 10, 25));
    JobDetails jd6 =
        new JobDetails(53000, "Database Administrator", "Full-time", new Date(123, 1, 1));
    EmployeeInformation empInfo6 =
        new EmployeeInformation("Claudia",
            address6, pd6, jd6, Arrays.asList("MySQL", "PostgreSQL", "MongoDB"));

    employeeManagement.addEmployee(empInfo1);
    employeeManagement.addEmployee(empInfo2);
    employeeManagement.addEmployee(empInfo3);
    employeeManagement.addEmployee(empInfo4);
    employeeManagement.addEmployee(empInfo5);
    employeeManagement.addEmployee(empInfo6);

    Trainer trainer1 = new Trainer("T1", empInfo1, "Java Specialist");
    Trainer trainer2 = new Trainer("T2", empInfo2, "Spring Specialist");
    Trainer trainer3 = new Trainer("T3", empInfo3, "DevOps Specialist");


    Course javaCourse = new Course(101, "Java Programming", 4, 50, "Programming");
    Course springCourse = new Course(102, "Spring Boot Development", 5, 50, "Framework");
    Course awsDevOpsCourse = new Course(103, "AwsDevOpsCourse", 3, 40, "Database");
    Course KotlinCourse = new Course(101, "Kotlin Programming", 4, 50, "Programming");
    Course JavaScriptCourse = new Course(102, "JavaScript", 5, 50, "Framework");
    Course TypeScriptCourse = new Course(103, "TypeScript", 3, 40, "Database");


    javaCourse.assignTrainer(trainer1);
    springCourse.assignTrainer(trainer2);
    awsDevOpsCourse.assignTrainer(trainer3);

    courseManagement.addCourse(javaCourse);
    courseManagement.addCourse(springCourse);
    courseManagement.addCourse(awsDevOpsCourse);

    Address studentAddress1 = new Address("Potsdamer Platz 3", "Berlin", "S-201", "10785", "Germany");
    Address studentAddress2 = new Address("Unter den Linden 5", "Berlin", "S-202", "10117", "Germany");

    Student student1 =
        studentManagement.createStudent(
            1001, "Mani", "mani@example.com", studentAddress1, new Date(95, 5, 15));
    Student student2 =
        studentManagement.createStudent(
            1002, "Sten", "sten@example.com", studentAddress2, new Date(96, 2, 25));

    Student student3 = studentManagement.createStudent(
        1003, "Mike", "asha@example.com", new Address("Student Str 3", "Berlin", "S-203", "10103", "Germany"), new Date(95, 10, 10));

    Student student4 = studentManagement.createStudent(
        1004, "Wiedemann", "ravi@example.com", new Address("Student Str 4", "Berlin", "S-204", "10104", "Germany"), new Date(96, 1, 12));

    Student student5 = studentManagement.createStudent(
        1005, "Florence", "kiran@example.com", new Address("Student Str 5", "Berlin", "S-205", "10105", "Germany"), new Date(95, 11, 5));

    Student student6 = studentManagement.createStudent(
        1006, "Tanya", "divya@example.com", new Address("Student Str 6", "Berlin", "S-206", "10106", "Germany"), new Date(96, 3, 20));

    Student student7 = studentManagement.createStudent(
        1007, "Dhaskhu", "naveen@example.com", new Address("Student Str 7", "Berlin", "S-207", "10107", "Germany"), new Date(95, 6, 18));

    Student student8 = studentManagement.createStudent(
        1008, "Karthi", "priya@example.com", new Address("Student Str 8", "Berlin", "S-208", "10108", "Germany"), new Date(96, 4, 28));

    Student student9 = studentManagement.createStudent(
        1009, "Nixon", "surya@example.com", new Address("Student Str 9", "Berlin", "S-209", "10109", "Germany"), new Date(95, 7, 22));

    Student student10 = studentManagement.createStudent(
        1010, "Anna", "rekha@example.com", new Address("Student Str 10", "Berlin", "S-210", "10110", "Germany"), new Date(96, 8, 30));


    studentManagement.addStudent(student1);
    studentManagement.addStudent(student2);
    studentManagement.addStudent(student3);
    studentManagement.addStudent(student4);
    studentManagement.addStudent(student5);
    studentManagement.addStudent(student6);
    studentManagement.addStudent(student7);
    studentManagement.addStudent(student8);
    studentManagement.addStudent(student9);
    studentManagement.addStudent(student10);

    Employee adminEmployee = new Employee("E100", "Admin Mani", "9988776655", "admin@school.com");
    Admin admin = new Admin(adminEmployee, "A001", "Admin Sten", "9988776655", "admin@school.com");

    System.out.println("\n Admin Details:");
    System.out.println(admin.getAdminDetails());


    System.out.println("\nEnrolling Students into Courses...");
    adminService.enrollStudentInCourse(student1, javaCourse, admin.getAdminID());
    adminService.enrollStudentInCourse(student4, awsDevOpsCourse, admin.getAdminID());
    adminService.enrollStudentInCourse(student7, TypeScriptCourse, admin.getAdminID());
    adminService.enrollStudentInCourse(student2, KotlinCourse, admin.getAdminID());

    adminService.enrollStudentInCourse(student1, JavaScriptCourse, admin.getAdminID());
    adminService.enrollStudentInCourse(student1, springCourse, admin.getAdminID());
    adminService.enrollStudentInCourse(student8, JavaScriptCourse, admin.getAdminID());

    adminService.enrollStudentInCourse(student1, KotlinCourse, admin.getAdminID());
    adminService.enrollStudentInCourse(student6, awsDevOpsCourse, admin.getAdminID());
    adminService.enrollStudentInCourse(student8, awsDevOpsCourse, admin.getAdminID());
    List<Student> javaStudents = enrollmentService.getStudentsByCourseName("Java Programming");
    System.out.println(
        " find all Students that are enrolled in a Course\n"
            + " Param: String courseName:");
    System.out.println(" Students enrolled in Java Programming:");
    for (Student s : javaStudents) {
      System.out.println("- " + s.getName());
    }
    List<Course> course = enrollmentService.getCoursesByStudentName("Mani");
    System.out.println(
        " find all Courses a Student is enrolled in\n"
            + " Param: String studentName or int studentId");
    System.out.println(" Course enrolled by mani:");
    for(Course ce: course)
    {
      System.out.println("- " + ce.getCourseName());
    }

    System.out.println(
        " find all Courses a Student is enrolled in\n"
            + " Param: String studentName or int studentId");
    System.out.println(" Course enrolled by mani:");
    for(Course ce: course)
    {
      System.out.println("- " + ce.getCourseName());
    }
    List<Course> underEnrolledCourses = enrollmentService.getCoursesWithFewerThanThreeStudents();
    System.out.println(
        " find all Courses that have less than three enrolled Student");
    System.out.println(" Courses with less than 3 students:");
    for (Course c : underEnrolledCourses) {
      System.out.println("- " + c.getCourseName());
    }
    enrollmentService.markExamHeld(student1, javaCourse);
    List<Course> coursesWithPendingExams = enrollmentService.getCoursesWithoutExamForStudent("Mani");

    System.out.println("Courses for Mani where exam is not yet held:");
    for (Course c : coursesWithPendingExams) {
      System.out.println("- " + c.getCourseName());
    }
  }
}
