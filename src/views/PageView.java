package views;
import controllers.PageController;
import models.Page;
public class PageView {
    models.Page model;
    controllers.PageController controller;

    public PageView(models.Page model, controllers.PageController controller) {
        this.model = model;
        this.controller = controller;
    }

    public void onUpdate(String update) {
        this.controller.updatePage("PageTitle", update); //example for updating the page title
    }

    public Page getModel() {
        return model;
    }

    public void setModel(Page model) {
        this.model = model;
    }

    public PageController getController() {
        return controller;
    }

    public void setController(PageController controller) {
        this.controller = controller;
    }

    public void show() {
        //Display or refresh the view of the page
    }
}

