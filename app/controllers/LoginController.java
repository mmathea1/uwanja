package controllers;

import play.mvc.Controller;
import play.mvc.Result;

public class LoginController extends Controller {

    public Result login() {
        return ok(views.html.login.render());
    }
}
