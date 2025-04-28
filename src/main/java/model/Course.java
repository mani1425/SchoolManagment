package model;

import java.util.ArrayList;
import java.util.List;

public class Course {
  private int courseID;
  private String courseName;
  private int credits;
  private List<Trainer> trainers = new ArrayList<>();
  private int maxStudents;
  private String category;

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

  public String getCourseName() {
    return courseName;
  }

  public int getCredits() {
    return credits;
  }
}

