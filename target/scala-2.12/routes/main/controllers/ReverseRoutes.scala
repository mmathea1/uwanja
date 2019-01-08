// @GENERATOR:play-routes-compiler
// @SOURCE:/home/mingina/Projects/uwanja/conf/routes
// @DATE:Wed Aug 22 16:46:09 EAT 2018

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:26
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:26
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:17
  class ReverseHomeworkAssignment(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:17
    def createHomework(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "assignHomework")
    }
  
  }

  // @LINE:18
  class ReverseSendNotification(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:20
    def sendMessage(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "sendNotification/message")
    }
  
    // @LINE:18
    def sendNotification(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "sendNotification")
    }
  
    // @LINE:19
    def makeAnnouncement(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "sendNotification/announcement")
    }
  
    // @LINE:21
    def sendPushNotification(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "sendNotification/pushNotification")
    }
  
  }

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }

  // @LINE:7
  class ReverseLoginController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:7
    def login(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "login")
    }
  
  }

  // @LINE:22
  class ReverseRequestMeeting(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:22
    def meetingRequest(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "meetingRequest")
    }
  
  }

  // @LINE:11
  class ReverseMarkAttendance(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:14
    def confirmAttendance(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "confirmAttendance")
    }
  
    // @LINE:11
    def getClassList(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "getClassList")
    }
  
  }


}
