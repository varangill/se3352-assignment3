package models;

import java.util.ArrayList;

public class User { //user is the superclass for Professor and Student
    private String number;
    private String name;
    private ArrayList<Course> courses;
    private ArrayList<Page> pages; //students can have 1 page per course, profs can have any number

    public ArrayList<Page> getPages() {
        return pages;
    }

    public void setPages(ArrayList<Page> pages) {
        this.pages = pages;
    }

    public String getNumber() {
        return number;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
