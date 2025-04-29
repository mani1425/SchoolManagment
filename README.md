
TODOS
    * remove Student.enrolledCourses -> use CourseEnrollment as a connection between Students and Courses
    * implement in Management:
        * find all Students that are enrolled in a Course
            * Param: String courseName
        * find all Courses a Student is enrolled in
            * Param: String studentName or int studentId
        * find all Courses that have less than three enrolled Students
        * find all Courses of a Student where no exam was held yet
            * Param: String studentName or int studentId
    * Methods like
        ```
            public String getProfessionalDetails() {
               return "Position: " + position + ", Salary: " + salary + ", Employment Type: " + employmentType + ", Joining Date: " + joiningDate;
            }
        ```
      should be named toString()
    * In EmployeeInformation
        `public String getFullPersonalDetails` should be `public PersonalDetails getPersonalDetails`

    2nd Project
    * Setup a simple SpringBoot "Hello World" project
        * Have a Controller defining an endpoint GET "/hello" that returns "Hello World!"
        * Have another endpoint GET "/hello/{name}" that uses a Path parameter to return "Hello Sten" if you call GET "/hello/Sten"
        * Optionally: Add JPA/Spring Data with H2 or Apache Derby as in memory DB
            * Add a repository that handles an Entity class
                * Entity = Address(String streetName, int houseNr, String firstName, String lastName, String City, String zipCode)
            * Write endpoints to save, fetch and delete Adresses
        * Optionally: If a solution with a controller is too much, then read into CommandLineRunner to just write it as static 
