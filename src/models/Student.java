package models;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Student extends User {

    private ArrayList<Comment> comments;

    public Student(String number, String name) {
        setNumber(number);
        setName(name);
        setPages(new ArrayList<Page>());
        setCourses(new ArrayList<Course>());
        comments = new ArrayList<Comment>();
    }
}
