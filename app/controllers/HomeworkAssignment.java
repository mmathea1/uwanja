package controllers;

import play.mvc.Controller;
import play.mvc.Result;

public class HomeworkAssignment extends Controller {

    public Result assignHomework() {
        return ok(views.html.homeworkAssignment.render());
    }
}
