package models;

import java.util.ArrayList;

public class Page {
    private String pageName; //generic page info
    private String pageNumber;
    private Student pageOwner;
    private Course course; //each page belongs to a course
    private ArrayList<Comment> comments;
    private RevisionHistory history;
    private ArrayList<Student> editors; //editors are other students the owner has granted permission to edit
    private String content; //page content would be HTML of the page

    public Page(String name, String number, Student owner, Course course) {
        this.pageName = name;
        this.pageNumber = number;
        this.course = course;
        this.pageOwner = owner;
        this.comments = new ArrayList<Comment>();
        this.editors = new ArrayList<Student>();
        this.history = new RevisionHistory(this);
    }

    //getters and setters
    public String getPageName() {
        return pageName;
    }

    public void setPageName(String pageName) {
        this.pageName = pageName;
    }

    public String getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
    }

    public Student getPageOwner() {
        return pageOwner;
    }

    public void setPageOwner(Student pageOwner) {
        this.pageOwner = pageOwner;
    }

    public ArrayList<Comment> getComments() {
        return comments;
    }

    public void setComments(ArrayList<Comment> comments) {
        this.comments = comments;
    }

    public RevisionHistory getHistory() {
        return history;
    }

    public void setHistory(RevisionHistory history) {
        this.history = history;
    }

    public ArrayList<Student> getEditors() {
        return editors;
    }

    public void setEditors(ArrayList<Student> editors) {
        this.editors = editors;
    }
}
