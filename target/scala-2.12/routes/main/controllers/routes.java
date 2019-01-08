// @GENERATOR:play-routes-compiler
// @SOURCE:/home/mingina/Projects/uwanja/conf/routes
// @DATE:Wed Aug 22 16:46:09 EAT 2018

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseHomeworkAssignment HomeworkAssignment = new controllers.ReverseHomeworkAssignment(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseSendNotification SendNotification = new controllers.ReverseSendNotification(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseHomeController HomeController = new controllers.ReverseHomeController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseLoginController LoginController = new controllers.ReverseLoginController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseRequestMeeting RequestMeeting = new controllers.ReverseRequestMeeting(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseMarkAttendance MarkAttendance = new controllers.ReverseMarkAttendance(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseHomeworkAssignment HomeworkAssignment = new controllers.javascript.ReverseHomeworkAssignment(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseSendNotification SendNotification = new controllers.javascript.ReverseSendNotification(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseHomeController HomeController = new controllers.javascript.ReverseHomeController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseLoginController LoginController = new controllers.javascript.ReverseLoginController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseRequestMeeting RequestMeeting = new controllers.javascript.ReverseRequestMeeting(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseMarkAttendance MarkAttendance = new controllers.javascript.ReverseMarkAttendance(RoutesPrefix.byNamePrefix());
  }

}
