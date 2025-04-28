package app;

import java.util.Arrays;
import java.util.Date;
import model.Address;
import model.Admin;
import model.Course;
import model.Employee;
import model.EmployeeInformation;
import model.JobDetails;
import model.PersonalDetails;
import model.Student;
import model.Trainer;
import service.AdminManagement;
import service.CourseManagement;
import service.EmployeeManagement;
import service.StudentManagement;

public class SchoolManagementApplication {
  public static void main(String[] args) {
    System.out.println("School Management Application Started...\n");

    StudentManagement studentManagement = new StudentManagement();
    EmployeeManagement employeeManagement = new EmployeeManagement();
    CourseManagement courseManagement = new CourseManagement();
    AdminManagement adminManagement = new AdminManagement(studentManagement, courseManagement);

    Address address1 = new Address("Alexanderplatz 1", "Berlin", "H-101", "10178", "Germany");
    PersonalDetails pd1 = new PersonalDetails("9123456789", "9876543210", new Date(90, 5, 15));
    JobDetails jd1 = new JobDetails(60000, "Software Engineer", "Full-time", new Date(120, 0, 1));
    EmployeeInformation empInfo1 =
        new EmployeeInformation(address1, pd1, jd1, Arrays.asList("Java", "Spring Boot"));

    Address address2 = new Address("Kurfürstendamm 26", "Berlin", "H-102", "10719", "Germany");
    PersonalDetails pd2 = new PersonalDetails("9234567890", "9876543211", new Date(91, 2, 1));
    JobDetails jd2 = new JobDetails(55000, "Senior Developer", "Full-time", new Date(121, 3, 1));
    EmployeeInformation empInfo2 =
        new EmployeeInformation(address2, pd2, jd2, Arrays.asList("Spring Boot", "Hibernate"));

    Address address3 = new Address("Sonnenallee 40", "Berlin", "H-103", "12045", "Germany");
    PersonalDetails pd3 = new PersonalDetails("9345678901", "9876543212", new Date(92, 7, 1));
    JobDetails jd3 = new JobDetails(50000, "Tester", "Full-time", new Date(122, 5, 1));
    EmployeeInformation empInfo3 =
        new EmployeeInformation(address3, pd3, jd3, Arrays.asList("Selenium", "API Testing"));

    Address address4 = new Address("Schönhauser Allee 80", "Berlin", "H-104", "10439", "Germany");
    PersonalDetails pd4 = new PersonalDetails("9456789012", "9876543213", new Date(93, 8, 10));
    JobDetails jd4 = new JobDetails(52000, "DevOps Engineer", "Full-time", new Date(121, 6, 1));
    EmployeeInformation empInfo4 =
        new EmployeeInformation(address4, pd4, jd4, Arrays.asList("AWS", "Docker", "Kubernetes"));

    Address address5 = new Address("Karl-Marx-Strasse 10", "Berlin", "H-105", "12043", "Germany");
    PersonalDetails pd5 = new PersonalDetails("9567890123", "9876543214", new Date(94, 9, 20));
    JobDetails jd5 = new JobDetails(51000, "Support Engineer", "Full-time", new Date(120, 2, 1));
    EmployeeInformation empInfo5 =
        new EmployeeInformation(address5, pd5, jd5, Arrays.asList("Networking", "Cloud Support"));

    Address address6 = new Address("Friedrichstrasse 90", "Berlin", "H-106", "10969", "Germany");
    PersonalDetails pd6 = new PersonalDetails("9678901234", "9876543215", new Date(95, 10, 25));
    JobDetails jd6 =
        new JobDetails(53000, "Database Administrator", "Full-time", new Date(123, 1, 1));
    EmployeeInformation empInfo6 =
        new EmployeeInformation(
            address6, pd6, jd6, Arrays.asList("MySQL", "PostgreSQL", "MongoDB"));

    employeeManagement.addEmployee(empInfo1);
    employeeManagement.addEmployee(empInfo2);
    employeeManagement.addEmployee(empInfo3);
    employeeManagement.addEmployee(empInfo4);
    employeeManagement.addEmployee(empInfo5);
    employeeManagement.addEmployee(empInfo6);

    Trainer trainer1 = new Trainer("T1", empInfo1, "Java Specialist");
    Trainer trainer2 = new Trainer("T2", empInfo2, "Spring Specialist");
    Trainer trainer3 = new Trainer("T3", empInfo3, "Hibernate Specialist");


    Course javaCourse = new Course(101, "Java Programming", 4, 50, "Programming");
    Course springCourse = new Course(102, "Spring Boot Development", 5, 50, "Framework");
    Course awsDevOpsCourse = new Course(103, "AwsDevOpsCourse", 3, 40, "Database");


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
            1002, "Sten", "karun@example.com", studentAddress2, new Date(96, 2, 25));

    studentManagement.addStudent(student1);
    studentManagement.addStudent(student2);

    Employee adminEmployee = new Employee("E100", "Admin Mani", "9988776655", "admin@school.com");
    Admin admin = new Admin(adminEmployee, "A001", "Sten", "9988776655", "admin@school.com");

    System.out.println("\n Admin Details:");
    System.out.println(admin.getAdminDetails());


    System.out.println("\nEnrolling Students into Courses...");
    adminManagement.enrollStudentInCourse(student1, javaCourse);
    adminManagement.enrollStudentInCourse(student2, springCourse);

    System.out.println("\n Employees in System:");
    employeeManagement.showAllEmployees();

    System.out.println("\nCourses and Assigned Trainers:");
    courseManagement.showAllCourses();

    System.out.println("\n Students and their Enrolled Courses:");
    studentManagement.showAllStudents();
  }
}
