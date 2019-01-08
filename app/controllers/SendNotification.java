package controllers;

import play.mvc.Controller;
import play.mvc.Result;

public class SendNotification extends Controller {

    public Result sendNotification() {
        return ok(views.html.sendNotifications.render());
    }

    public Result makeAnnouncement() {
        return ok(views.html.announcement.render());
    }

    public Result sendMessage() {
        return ok(views.html.sendMessage.render());
    }

    public Result sendPushNotification() {
        return ok(views.html.sendPushNotification.render());
    }
}
