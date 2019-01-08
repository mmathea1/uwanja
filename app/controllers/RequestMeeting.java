package controllers;

import play.mvc.Controller;
import play.mvc.Result;

public class RequestMeeting extends Controller {

    public Result meetingRequest() {
        return ok(views.html.requestMeeting.render());
    }
}
