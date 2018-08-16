package controllers;


import play.mvc.Controller;
import play.mvc.Result;

public class MarkAttendance extends Controller {
    public Result markAttendance() {
        return ok(views.html.markAttendance.render());
    }
}
