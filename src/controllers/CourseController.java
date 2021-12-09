package controllers;

import models.Course;
import views.CourseView;

public class CourseController {
    models.Course model;
    views.CourseView view;
    public CourseController(models.Course model, views.CourseView view) {
        this.model = model;
        this.view = view;
        this.view.setController(this); //set the view to this
        view.show();
    }

    public void updateCourse(String typeOfUpdate, String update) {
        //typeOfUpdate represents what type of update is being performed on the model
        //could be a professor adding a new student, a student adding a new page, and so on

        //update refers to the contents of the update, for example, could be the new student or the new page
        //in an actual implementation there would be separate methods - so adding a student would be a function addStudent, adding a new page would be another function addPage
        //simplifying these actions into 1 function as this is skeleton code

        if (typeOfUpdate == "courseName") { //example 1 - set model's name if that's the update requested
            model.setCourseName(update);
        }
        view.show(); //refresh model upon update
    }

    public Course getModel() {
        return model;
    }

    public void setModel(Course model) {
        this.model = model;
    }

    public CourseView getView() {
        return view;
    }

    public void setView(CourseView view) {
        this.view = view;
    }
}
