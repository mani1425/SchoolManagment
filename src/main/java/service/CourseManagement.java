package service;

import model.Course;
import model.Trainer;

import java.util.ArrayList;
import java.util.List;

public class CourseManagement {
  private List<Course> courses = new ArrayList<>();


  public void addCourse(Course course) {
    courses.add(course);
  }

  public void assignTrainerToCourse(Course course, Trainer trainer) {
    course.assignTrainer(trainer);
  }

  public void showAllCourses() {
    for (Course c : courses) {
      System.out.print(c.getCourseName() + " | Credits: " + c.getCredits());

      if (!c.getTrainers().isEmpty()) {
        System.out.print(" | Trainers: ");
        for (Trainer t : c.getTrainers()) {
          System.out.print(t.getTrainerName() + " ");
        }
      }

      System.out.println();
    }
  }

  public List<Course> getAllCourses() {
    return courses;
  }
}
