package models;

import java.util.ArrayList;

public class Course {
    //store generic course info
    private String courseName;
    private String courseNumber;
    private Professor courseProf;
    private ArrayList<Student> courseStudents; //store an arraylist of all students
    private ArrayList<Page> pages; //store an arraylist of all pages


    public Course(String name, String num, Professor prof) {
        this.courseName = name;
        this.courseNumber = num;
        this.courseProf = prof;
        this.courseStudents = new ArrayList<Student>();
        this.pages = new ArrayList<Page>();
    }


    //getters and setters below
    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }

    public Professor getCourseProf() {
        return courseProf;
    }

    public void setCourseProf(Professor courseProf) {
        this.courseProf = courseProf;
    }

    public ArrayList<Student> getCourseStudents() {
        return courseStudents;
    }

    public void setCourseStudents(ArrayList<Student> courseStudents) {
        this.courseStudents = courseStudents;
    }

    public ArrayList<Page> getPages() {
        return pages;
    }

    public void setPages(ArrayList<Page> pages) {
        this.pages = pages;
    }
}
