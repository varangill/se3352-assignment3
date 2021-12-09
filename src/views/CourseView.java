package views;

import controllers.CourseController;
import models.Course;

public class CourseView { //a general view for the course, including a list of the pages and lessons for the course

    models.Course model;
    controllers.CourseController controller;

    public CourseView(models.Course model, controllers.CourseController controller) {
        this.model = model;
        this.controller = controller;
    }

    public void onUpdate(String update) {
        this.controller.updateCourse("courseName", update); //example for updating the course name
    }

    public Course getModel() {
        return model;
    }

    public void setModel(Course model) {
        this.model = model;
    }

    public CourseController getController() {
        return controller;
    }

    public void setController(CourseController controller) {
        this.controller = controller;
    }

    public void show() {
        //Display or refresh the view of the course
    }
}
