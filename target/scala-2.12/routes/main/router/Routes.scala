// @GENERATOR:play-routes-compiler
// @SOURCE:/home/mingina/Projects/uwanja/conf/routes
// @DATE:Wed Aug 22 16:46:09 EAT 2018

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_1: controllers.HomeController,
  // @LINE:7
  LoginController_6: controllers.LoginController,
  // @LINE:11
  MarkAttendance_2: controllers.MarkAttendance,
  // @LINE:17
  HomeworkAssignment_4: controllers.HomeworkAssignment,
  // @LINE:18
  SendNotification_0: controllers.SendNotification,
  // @LINE:22
  RequestMeeting_3: controllers.RequestMeeting,
  // @LINE:26
  Assets_5: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_1: controllers.HomeController,
    // @LINE:7
    LoginController_6: controllers.LoginController,
    // @LINE:11
    MarkAttendance_2: controllers.MarkAttendance,
    // @LINE:17
    HomeworkAssignment_4: controllers.HomeworkAssignment,
    // @LINE:18
    SendNotification_0: controllers.SendNotification,
    // @LINE:22
    RequestMeeting_3: controllers.RequestMeeting,
    // @LINE:26
    Assets_5: controllers.Assets
  ) = this(errorHandler, HomeController_1, LoginController_6, MarkAttendance_2, HomeworkAssignment_4, SendNotification_0, RequestMeeting_3, Assets_5, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_1, LoginController_6, MarkAttendance_2, HomeworkAssignment_4, SendNotification_0, RequestMeeting_3, Assets_5, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.LoginController.login"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getClassList""", """controllers.MarkAttendance.getClassList"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """confirmAttendance""", """controllers.MarkAttendance.confirmAttendance"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assignHomework""", """controllers.HomeworkAssignment.createHomework"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """sendNotification""", """controllers.SendNotification.sendNotification"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """sendNotification/announcement""", """controllers.SendNotification.makeAnnouncement"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """sendNotification/message""", """controllers.SendNotification.sendMessage"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """sendNotification/pushNotification""", """controllers.SendNotification.sendPushNotification"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """meetingRequest""", """controllers.RequestMeeting.meetingRequest"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_1.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample family page""",
      Seq()
    )
  )

  // @LINE:7
  private[this] lazy val controllers_LoginController_login1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_LoginController_login1_invoker = createInvoker(
    LoginController_6.login,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "login",
      Nil,
      "GET",
      this.prefix + """login""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_MarkAttendance_getClassList2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getClassList")))
  )
  private[this] lazy val controllers_MarkAttendance_getClassList2_invoker = createInvoker(
    MarkAttendance_2.getClassList,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MarkAttendance",
      "getClassList",
      Nil,
      "GET",
      this.prefix + """getClassList""",
      """ MARK ATTENDANCE""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_MarkAttendance_confirmAttendance3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("confirmAttendance")))
  )
  private[this] lazy val controllers_MarkAttendance_confirmAttendance3_invoker = createInvoker(
    MarkAttendance_2.confirmAttendance,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MarkAttendance",
      "confirmAttendance",
      Nil,
      "POST",
      this.prefix + """confirmAttendance""",
      """""",
      Seq("""nocsrf""")
    )
  )

  // @LINE:17
  private[this] lazy val controllers_HomeworkAssignment_createHomework4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assignHomework")))
  )
  private[this] lazy val controllers_HomeworkAssignment_createHomework4_invoker = createInvoker(
    HomeworkAssignment_4.createHomework,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeworkAssignment",
      "createHomework",
      Nil,
      "GET",
      this.prefix + """assignHomework""",
      """""",
      Seq()
    )
  )

  // @LINE:18
  private[this] lazy val controllers_SendNotification_sendNotification5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("sendNotification")))
  )
  private[this] lazy val controllers_SendNotification_sendNotification5_invoker = createInvoker(
    SendNotification_0.sendNotification,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SendNotification",
      "sendNotification",
      Nil,
      "GET",
      this.prefix + """sendNotification""",
      """""",
      Seq()
    )
  )

  // @LINE:19
  private[this] lazy val controllers_SendNotification_makeAnnouncement6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("sendNotification/announcement")))
  )
  private[this] lazy val controllers_SendNotification_makeAnnouncement6_invoker = createInvoker(
    SendNotification_0.makeAnnouncement,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SendNotification",
      "makeAnnouncement",
      Nil,
      "GET",
      this.prefix + """sendNotification/announcement""",
      """""",
      Seq()
    )
  )

  // @LINE:20
  private[this] lazy val controllers_SendNotification_sendMessage7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("sendNotification/message")))
  )
  private[this] lazy val controllers_SendNotification_sendMessage7_invoker = createInvoker(
    SendNotification_0.sendMessage,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SendNotification",
      "sendMessage",
      Nil,
      "GET",
      this.prefix + """sendNotification/message""",
      """""",
      Seq()
    )
  )

  // @LINE:21
  private[this] lazy val controllers_SendNotification_sendPushNotification8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("sendNotification/pushNotification")))
  )
  private[this] lazy val controllers_SendNotification_sendPushNotification8_invoker = createInvoker(
    SendNotification_0.sendPushNotification,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SendNotification",
      "sendPushNotification",
      Nil,
      "GET",
      this.prefix + """sendNotification/pushNotification""",
      """""",
      Seq()
    )
  )

  // @LINE:22
  private[this] lazy val controllers_RequestMeeting_meetingRequest9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("meetingRequest")))
  )
  private[this] lazy val controllers_RequestMeeting_meetingRequest9_invoker = createInvoker(
    RequestMeeting_3.meetingRequest,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RequestMeeting",
      "meetingRequest",
      Nil,
      "GET",
      this.prefix + """meetingRequest""",
      """""",
      Seq()
    )
  )

  // @LINE:26
  private[this] lazy val controllers_Assets_versioned10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned10_invoker = createInvoker(
    Assets_5.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_1.index)
      }
  
    // @LINE:7
    case controllers_LoginController_login1_route(params@_) =>
      call { 
        controllers_LoginController_login1_invoker.call(LoginController_6.login)
      }
  
    // @LINE:11
    case controllers_MarkAttendance_getClassList2_route(params@_) =>
      call { 
        controllers_MarkAttendance_getClassList2_invoker.call(MarkAttendance_2.getClassList)
      }
  
    // @LINE:14
    case controllers_MarkAttendance_confirmAttendance3_route(params@_) =>
      call { 
        controllers_MarkAttendance_confirmAttendance3_invoker.call(MarkAttendance_2.confirmAttendance)
      }
  
    // @LINE:17
    case controllers_HomeworkAssignment_createHomework4_route(params@_) =>
      call { 
        controllers_HomeworkAssignment_createHomework4_invoker.call(HomeworkAssignment_4.createHomework)
      }
  
    // @LINE:18
    case controllers_SendNotification_sendNotification5_route(params@_) =>
      call { 
        controllers_SendNotification_sendNotification5_invoker.call(SendNotification_0.sendNotification)
      }
  
    // @LINE:19
    case controllers_SendNotification_makeAnnouncement6_route(params@_) =>
      call { 
        controllers_SendNotification_makeAnnouncement6_invoker.call(SendNotification_0.makeAnnouncement)
      }
  
    // @LINE:20
    case controllers_SendNotification_sendMessage7_route(params@_) =>
      call { 
        controllers_SendNotification_sendMessage7_invoker.call(SendNotification_0.sendMessage)
      }
  
    // @LINE:21
    case controllers_SendNotification_sendPushNotification8_route(params@_) =>
      call { 
        controllers_SendNotification_sendPushNotification8_invoker.call(SendNotification_0.sendPushNotification)
      }
  
    // @LINE:22
    case controllers_RequestMeeting_meetingRequest9_route(params@_) =>
      call { 
        controllers_RequestMeeting_meetingRequest9_invoker.call(RequestMeeting_3.meetingRequest)
      }
  
    // @LINE:26
    case controllers_Assets_versioned10_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned10_invoker.call(Assets_5.versioned(path, file))
      }
  }
}
