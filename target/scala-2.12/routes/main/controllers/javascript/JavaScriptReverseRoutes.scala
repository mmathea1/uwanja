// @GENERATOR:play-routes-compiler
// @SOURCE:/home/mingina/Projects/uwanja/conf/routes
// @DATE:Wed Aug 22 16:46:09 EAT 2018

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {

  // @LINE:26
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:26
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:17
  class ReverseHomeworkAssignment(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:17
    def createHomework: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeworkAssignment.createHomework",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assignHomework"})
        }
      """
    )
  
  }

  // @LINE:18
  class ReverseSendNotification(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:20
    def sendMessage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SendNotification.sendMessage",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "sendNotification/message"})
        }
      """
    )
  
    // @LINE:18
    def sendNotification: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SendNotification.sendNotification",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "sendNotification"})
        }
      """
    )
  
    // @LINE:19
    def makeAnnouncement: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SendNotification.makeAnnouncement",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "sendNotification/announcement"})
        }
      """
    )
  
    // @LINE:21
    def sendPushNotification: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SendNotification.sendPushNotification",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "sendNotification/pushNotification"})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }

  // @LINE:7
  class ReverseLoginController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:7
    def login: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LoginController.login",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
  }

  // @LINE:22
  class ReverseRequestMeeting(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:22
    def meetingRequest: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RequestMeeting.meetingRequest",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "meetingRequest"})
        }
      """
    )
  
  }

  // @LINE:11
  class ReverseMarkAttendance(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:14
    def confirmAttendance: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MarkAttendance.confirmAttendance",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "confirmAttendance"})
        }
      """
    )
  
    // @LINE:11
    def getClassList: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MarkAttendance.getClassList",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "getClassList"})
        }
      """
    )
  
  }


}
