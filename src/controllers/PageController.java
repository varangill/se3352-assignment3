package controllers;
import models.Page;
import views.PageView;
public class PageController {
    models.Page model;
    views.PageView view;

    public PageController(models.Page model, views.PageView view) {
        this.model = model;
        this.view = view;
        this.view.setController(this); //set the view to this
        view.show();
    }

    public void updatePage(String typeOfUpdate, String update) {
        //typeOfUpdate represents what type of update is being performed on the model
        //could be a professor adding a new student, a student adding a new page, and so on

        //update refers to the contents of the update, for example, could be the new student or the new page
        //in an actual implementation there would be separate methods - so adding a student would be a function addStudent, adding a new page would be another function addPage
        //simplifying these actions into 1 function as this is skeleton code

        if (typeOfUpdate == "PageName") { //example 1 - set model's name if that's the update requested
            model.setPageName(update);
        }
        view.show(); //refresh model upon update
    }

    public Page getModel() {
        return model;
    }

    public void setModel(Page model) {
        this.model = model;
    }

    public PageView getView() {
        return view;
    }

    public void setView(PageView view) {
        this.view = view;
    }

}
