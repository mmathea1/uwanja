
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /*
* This template is called from the `index` template. This template
* handles the rendering of the page header and body tags. It takes
* two arguments, a `String` for the title of the page and an `Html`
* object to insert into the body of the page.
*/
  def apply/*7.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*8.1*/("""
"""),format.raw/*9.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="">
        """),format.raw/*17.62*/("""
        """),format.raw/*18.9*/("""<title>"""),_display_(/*18.17*/title),format.raw/*18.22*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*19.54*/routes/*19.60*/.Assets.versioned("vendor/bootstrap/css/bootstrap.min.css")),format.raw/*19.119*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*20.54*/routes/*20.60*/.Assets.versioned("vendor/metisMenu/metisMenu.min.css")),format.raw/*20.115*/("""">

        <link rel="stylesheet" media="screen" href=""""),_display_(/*22.54*/routes/*22.60*/.Assets.versioned("dist/css/sb-admin-2.css")),format.raw/*22.104*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*23.54*/routes/*23.60*/.Assets.versioned("stylesheets/morris.css")),format.raw/*23.103*/("""">

        <link rel="stylesheet" media="screen" href=""""),_display_(/*25.54*/routes/*25.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*25.101*/("""">

        <link rel="stylesheet" media="screen" href=""""),_display_(/*27.54*/routes/*27.60*/.Assets.versioned("stylesheets/all.min.css")),format.raw/*27.104*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*28.54*/routes/*28.60*/.Assets.versioned("vendor/datatables-plugins/dataTables.bootstrap.css")),format.raw/*28.131*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*29.54*/routes/*29.60*/.Assets.versioned("vendor/datatables-responsive/dataTables.responsive.css")),format.raw/*29.135*/("""">


        """),format.raw/*32.107*/("""
        """),format.raw/*33.9*/("""<link rel="stylesheet" media="screen" href=""""),_display_(/*33.54*/routes/*33.60*/.Assets.versioned("vendor/morrisjs/morris.css")),format.raw/*33.107*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*34.54*/routes/*34.60*/.Assets.versioned("vendor/font-awesome/css/font-awesome.min.css")),format.raw/*34.125*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*35.59*/routes/*35.65*/.Assets.versioned("images/favicon.png")),format.raw/*35.104*/("""">

            <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
            <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
            <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
    </head>
    <body>
        <div id="wrapper">
                <!-- Navigation -->
            <nav class="navbar navbar-default navbar-static-top" role="navigation" style="margin-bottom: 0">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="/">Teacher Portal</a>
                </div>
                    <!-- /.navbar-header -->

                <ul class="nav navbar-top-links navbar-right">
                    <li class="dropdown">
                        <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                            <i class="fa fa-envelope fa-fw"></i> <i class="fa fa-caret-down"></i>
                        </a>
                        <ul class="dropdown-menu dropdown-messages">
                            <li>
                                <a href="#">
                                    <div>
                                        <strong>John Smith</strong>
                                        <span class="pull-right text-muted">
                                            <em>Yesterday</em>
                                        </span>
                                    </div>
                                    <div>
                                        Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque eleifend...</div>
                                </a>
                            </li>
                            <li class="divider"></li>
                            <li>
                                <a href="#">
                                    <div>
                                        <strong>John Smith</strong>
                                        <span class="pull-right text-muted">
                                            <em>Yesterday</em>
                                        </span>
                                    </div>
                                    <div>
                                        Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque eleifend...</div>
                                </a>
                            </li>
                            <li class="divider"></li>
                            <li>
                                <a href="#">
                                    <div>
                                        <strong>John Smith</strong>
                                        <span class="pull-right text-muted">
                                            <em>Yesterday</em>
                                        </span>
                                    </div>
                                    <div>
                                        Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque eleifend...</div>
                                </a>
                            </li>
                            <li class="divider"></li>
                            <li>
                                <a class="text-center" href="#">
                                    <strong>Read All Messages</strong>
                                    <i class="fa fa-angle-right"></i>
                                </a>
                            </li>
                        </ul>
                            <!-- /.dropdown-messages -->
                    </li>
                        <!-- /.dropdown -->
                    <li class="dropdown">
                        <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                            <i class="fa fa-tasks fa-fw"></i> <i class="fa fa-caret-down"></i>
                        </a>
                        <ul class="dropdown-menu dropdown-tasks">
                            <li>
                                <a href="#">
                                    <div>
                                        <p>
                                            <strong>Task 1</strong>
                                            <span class="pull-right text-muted">40% Complete</span>
                                        </p>
                                        <div class="progress progress-striped active">
                                            <div class="progress-bar progress-bar-success" role="progressbar" aria-valuenow="40" aria-valuemin="0" aria-valuemax="100" style="width: 40%">
                                                <span class="sr-only">40% Complete (success)</span>
                                            </div>
                                        </div>
                                    </div>
                                </a>
                            </li>
                            <li class="divider"></li>
                            <li>
                                <a href="#">
                                    <div>
                                        <p>
                                            <strong>Task 2</strong>
                                            <span class="pull-right text-muted">20% Complete</span>
                                        </p>
                                        <div class="progress progress-striped active">
                                            <div class="progress-bar progress-bar-info" role="progressbar" aria-valuenow="20" aria-valuemin="0" aria-valuemax="100" style="width: 20%">
                                                <span class="sr-only">20% Complete</span>
                                            </div>
                                        </div>
                                    </div>
                                </a>
                            </li>
                            <li class="divider"></li>
                            <li>
                                <a href="#">
                                    <div>
                                        <p>
                                            <strong>Task 3</strong>
                                            <span class="pull-right text-muted">60% Complete</span>
                                        </p>
                                        <div class="progress progress-striped active">
                                            <div class="progress-bar progress-bar-warning" role="progressbar" aria-valuenow="60" aria-valuemin="0" aria-valuemax="100" style="width: 60%">
                                                <span class="sr-only">60% Complete (warning)</span>
                                            </div>
                                        </div>
                                    </div>
                                </a>
                            </li>
                            <li class="divider"></li>
                            <li>
                                <a href="#">
                                    <div>
                                        <p>
                                            <strong>Task 4</strong>
                                            <span class="pull-right text-muted">80% Complete</span>
                                        </p>
                                        <div class="progress progress-striped active">
                                            <div class="progress-bar progress-bar-danger" role="progressbar" aria-valuenow="80" aria-valuemin="0" aria-valuemax="100" style="width: 80%">
                                                <span class="sr-only">80% Complete (danger)</span>
                                            </div>
                                        </div>
                                    </div>
                                </a>
                            </li>
                            <li class="divider"></li>
                            <li>
                                <a class="text-center" href="#">
                                    <strong>See All Tasks</strong>
                                    <i class="fa fa-angle-right"></i>
                                </a>
                            </li>
                        </ul>
                            <!-- /.dropdown-tasks -->
                    </li>
                        <!-- /.dropdown -->
                    <li class="dropdown">
                        <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                            <i class="fa fa-bell fa-fw"></i> <i class="fa fa-caret-down"></i>
                        </a>
                        <ul class="dropdown-menu dropdown-alerts">
                            <li>
                                <a href="#">
                                    <div>
                                        <i class="fa fa-comment fa-fw"></i> New Comment
                                        <span class="pull-right text-muted small">4 minutes ago</span>
                                    </div>
                                </a>
                            </li>
                            <li class="divider"></li>
                            <li>
                                <a href="#">
                                    <div>
                                        <i class="fa fa-twitter fa-fw"></i> 3 New Followers
                                        <span class="pull-right text-muted small">12 minutes ago</span>
                                    </div>
                                </a>
                            </li>
                            <li class="divider"></li>
                            <li>
                                <a href="#">
                                    <div>
                                        <i class="fa fa-envelope fa-fw"></i> Message Sent
                                        <span class="pull-right text-muted small">4 minutes ago</span>
                                    </div>
                                </a>
                            </li>
                            <li class="divider"></li>
                            <li>
                                <a href="#">
                                    <div>
                                        <i class="fa fa-tasks fa-fw"></i> New Task
                                        <span class="pull-right text-muted small">4 minutes ago</span>
                                    </div>
                                </a>
                            </li>
                            <li class="divider"></li>
                            <li>
                                <a href="#">
                                    <div>
                                        <i class="fa fa-upload fa-fw"></i> Server Rebooted
                                        <span class="pull-right text-muted small">4 minutes ago</span>
                                    </div>
                                </a>
                            </li>
                            <li class="divider"></li>
                            <li>
                                <a class="text-center" href="#">
                                    <strong>See All Alerts</strong>
                                    <i class="fa fa-angle-right"></i>
                                </a>
                            </li>
                        </ul>
                            <!-- /.dropdown-alerts -->
                    </li>
                        <!-- /.dropdown -->
                    <li class="dropdown">
                        <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                            <i class="fa fa-user fa-fw"></i> <i class="fa fa-caret-down"></i>
                        </a>
                        <ul class="dropdown-menu dropdown-user">
                            <li><a href="#"><i class="fa fa-user fa-fw"></i> User Profile</a>
                            </li>
                            <li><a href="#"><i class="fa fa-gear fa-fw"></i> Settings</a>
                            </li>
                            <li class="divider"></li>
                            <li><a href="login.scala.html"><i class="fa fa-sign-out fa-fw"></i> Logout</a>
                            </li>
                        </ul>
                            <!-- /.dropdown-user -->
                    </li>
                        <!-- /.dropdown -->
                </ul>
                    <!-- /.navbar-top-links -->

                <div class="navbar-default sidebar" role="navigation">
                    <div class="sidebar-nav navbar-collapse">
                        <ul class="nav" id="side-menu">
                            <li class="sidebar-search">
                                <div class="input-group custom-search-form">
                                    <input type="text" class="form-control" placeholder="Search...">
                                    <span class="input-group-btn">
                                        <button class="btn btn-default" type="button">
                                            <i class="fa fa-search"></i>
                                        </button>
                                    </span>
                                </div>
                                    <!-- /input-group -->
                            </li>
                            <li>
                                <a href="/"><i class="fa fa-dashboard fa-fw"></i> Dashboard</a>
                            </li>
                            <li>
                                <a href="/getClassList"><i class="fa fa-check-square-o"></i> Mark Attendance</a>
                            </li>
                            <li>
                                <a href="/assignHomework"><i class="fa fa-book"></i> Assign Homework </a>
                            </li>
                            <li>
                                <a href="/sendNotification"><i class="fa fa-envelope"></i>
                                    Messages  <span class="fa arrow"></span> </a>

                                <ul class="nav nav-second-level">
                                    <li>
                                        <a href="/sendNotification/announcement"><i class="fa fa-bullhorn"></i>
                                            Make an Announcement</a>
                                    </li>
                                    <li>
                                        <a href="/sendNotification/message"><i class="fa fa-comment"></i>
                                            Send a Message</a>
                                    </li>
                                    <li>
                                        <a href="/sendNotification/pushNotification "><i class="fa fa-bell"></i>
                                            Push a Notification</a>
                                    </li>

                                </ul>
                            </li>
                            <li>
                                <a href="/meetingRequest"><i class="fa fa-calendar"></i> Request a meeting</a>
                            </li>
                        </ul>
                    </div>
                        <!-- /.sidebar-collapse -->
                </div>
                    <!-- /.navbar-static-side -->
            </nav>
        </div>
        """),format.raw/*326.31*/("""
        """),_display_(/*327.10*/content),format.raw/*327.17*/("""



        """),format.raw/*331.9*/("""<script type="text/javascript" src='"""),_display_(/*331.46*/routes/*331.52*/.Assets.versioned("/javascripts/react.js")),format.raw/*331.94*/("""'></script>
        <script type='text/javascript' src='"""),_display_(/*332.46*/routes/*332.52*/.Assets.versioned("javascripts/react-dom.js")),format.raw/*332.97*/("""'></script>
        <script src=""""),_display_(/*333.23*/routes/*333.29*/.Assets.versioned("vendor/jquery/jquery.min.js")),format.raw/*333.77*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*334.23*/routes/*334.29*/.Assets.versioned("vendor/bootstrap/js/bootstrap.min.js")),format.raw/*334.86*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*335.23*/routes/*335.29*/.Assets.versioned("vendor/metisMenu/metisMenu.min.js")),format.raw/*335.83*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*336.23*/routes/*336.29*/.Assets.versioned("vendor/flot/excanvas.min.js")),format.raw/*336.77*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*337.23*/routes/*337.29*/.Assets.versioned("vendor/flot/jquery.flot.js")),format.raw/*337.76*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*338.23*/routes/*338.29*/.Assets.versioned("vendor/flot/jquery.flot.pie.js")),format.raw/*338.80*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*339.23*/routes/*339.29*/.Assets.versioned("vendor/flot/jquery.flot.resize.js")),format.raw/*339.83*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*340.23*/routes/*340.29*/.Assets.versioned("vendor/flot/jquery.flot.time.js")),format.raw/*340.81*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*341.23*/routes/*341.29*/.Assets.versioned("vendor/flot-tooltip/jquery.flot.tooltip.min.js")),format.raw/*341.96*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*342.23*/routes/*342.29*/.Assets.versioned("data/flot-data.js")),format.raw/*342.67*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*343.23*/routes/*343.29*/.Assets.versioned("vendor/raphael/raphael.min.js")),format.raw/*343.79*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*344.23*/routes/*344.29*/.Assets.versioned("vendor/morrisjs/morris.min.js")),format.raw/*344.79*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*345.23*/routes/*345.29*/.Assets.versioned("data/morris-data.js")),format.raw/*345.69*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*346.23*/routes/*346.29*/.Assets.versioned("vendor/datatables/js/jquery.dataTables.min.js")),format.raw/*346.95*/("""" type="text/javascript"></script>

        <script src=""""),_display_(/*348.23*/routes/*348.29*/.Assets.versioned("vendor/datatables-plugins/dataTables.bootstrap.min.js")),format.raw/*348.103*/("""" type="text/javascript"></script>

        <script src=""""),_display_(/*350.23*/routes/*350.29*/.Assets.versioned("vendor/datatables-responsive/dataTables.responsive.js")),format.raw/*350.103*/("""" type="text/javascript"></script>
        """),format.raw/*351.107*/("""
        """),format.raw/*352.107*/("""

        """),format.raw/*354.9*/("""<script src=""""),_display_(/*354.23*/routes/*354.29*/.Assets.versioned("dist/js/sb-admin-2.js")),format.raw/*354.71*/("""" type="text/javascript"></script>


    </body>
</html>
"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Aug 22 16:16:29 EAT 2018
                  SOURCE: /home/mingina/Projects/uwanja/app/views/main.scala.html
                  HASH: eca114e8c99432474030a526cafdc2e65047684a
                  MATRIX: 1201->255|1325->286|1352->287|1705->665|1741->674|1776->682|1802->687|1891->749|1906->755|1987->814|2070->870|2085->876|2162->931|2246->988|2261->994|2327->1038|2410->1094|2425->1100|2490->1143|2574->1200|2589->1206|2652->1247|2736->1304|2751->1310|2817->1354|2900->1410|2915->1416|3008->1487|3091->1543|3106->1549|3203->1624|3245->1735|3281->1744|3353->1789|3368->1795|3437->1842|3520->1898|3535->1904|3622->1969|3710->2030|3725->2036|3786->2075|19899->18248|19937->18258|19966->18265|20006->18277|20071->18314|20087->18320|20151->18362|20236->18419|20252->18425|20319->18470|20381->18504|20397->18510|20467->18558|20552->18615|20568->18621|20647->18678|20732->18735|20748->18741|20824->18795|20909->18852|20925->18858|20995->18906|21080->18963|21096->18969|21165->19016|21250->19073|21266->19079|21339->19130|21424->19187|21440->19193|21516->19247|21601->19304|21617->19310|21691->19362|21776->19419|21792->19425|21881->19492|21966->19549|21982->19555|22042->19593|22127->19650|22143->19656|22215->19706|22300->19763|22316->19769|22388->19819|22473->19876|22489->19882|22551->19922|22636->19979|22652->19985|22740->20051|22826->20109|22842->20115|22939->20189|23025->20247|23041->20253|23138->20327|23211->20468|23250->20575|23288->20585|23330->20599|23346->20605|23410->20647
                  LINES: 33->7|38->8|39->9|47->17|48->18|48->18|48->18|49->19|49->19|49->19|50->20|50->20|50->20|52->22|52->22|52->22|53->23|53->23|53->23|55->25|55->25|55->25|57->27|57->27|57->27|58->28|58->28|58->28|59->29|59->29|59->29|62->32|63->33|63->33|63->33|63->33|64->34|64->34|64->34|65->35|65->35|65->35|355->326|356->327|356->327|360->331|360->331|360->331|360->331|361->332|361->332|361->332|362->333|362->333|362->333|363->334|363->334|363->334|364->335|364->335|364->335|365->336|365->336|365->336|366->337|366->337|366->337|367->338|367->338|367->338|368->339|368->339|368->339|369->340|369->340|369->340|370->341|370->341|370->341|371->342|371->342|371->342|372->343|372->343|372->343|373->344|373->344|373->344|374->345|374->345|374->345|375->346|375->346|375->346|377->348|377->348|377->348|379->350|379->350|379->350|380->351|381->352|383->354|383->354|383->354|383->354
                  -- GENERATED --
              */
          