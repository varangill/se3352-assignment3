package models;

import java.util.ArrayList;

public class Professor extends User{
    public Professor(String number, String name) { //setup model
        setNumber(number);
        setName(name);
        setPages(new ArrayList<Page>());
        setCourses(new ArrayList<Course>());
    }
}
