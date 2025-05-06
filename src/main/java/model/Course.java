package model;

import java.util.ArrayList;
import java.util.List;

public class Course {
  private int courseID;
  private String courseName;
  private int credits;
  private int maxStudents;
  private String category;
  private List<Trainer> trainers = new ArrayList<>();

  public Course(int courseID, String courseName, int credits, int maxStudents, String category) {
    this.courseID = courseID;
    this.courseName = courseName;
    this.credits = credits;
    this.maxStudents = maxStudents;
    this.category = category;
  }

  public void assignTrainer(Trainer trainer) {
    trainers.add(trainer);
  }

  public List<Trainer> getTrainers() {
    return trainers;
  }

  public int getCredits() {
    return credits;
  }

  public String getCourseName() {
    return courseName;
  }

  public int getCourseID() {
    return courseID;
  }

  public String getCategory() {
    return category;
  }
}
