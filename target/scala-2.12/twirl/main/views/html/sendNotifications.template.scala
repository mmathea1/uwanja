
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

object sendNotifications extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/main("Send Notification")/*1.27*/ {_display_(Seq[Any](format.raw/*1.29*/("""
    """),format.raw/*2.5*/("""<div id="page-wrapper">
        <div class="row">
            <div class="col-lg-12">
                <h1 class="page-header">Notifications</h1>
            </div>
                <!-- /.col-lg-12 -->
        </div>
            <!-- /.row -->
        <div class="row">
            <div class="col-lg-6">
                <div class="panel panel-default">
                    <div class="panel-heading">
                        Alert Styles
                    </div>
                        <!-- /.panel-heading -->
                    <div class="panel-body">
                        <div class="alert alert-success">
                            Lorem ipsum dolor sit amet, consectetur adipisicing elit. <a href="#" class="alert-link">
                            Alert Link</a>.
                        </div>
                        <div class="alert alert-info">
                            Lorem ipsum dolor sit amet, consectetur adipisicing elit. <a href="#" class="alert-link">
                            Alert Link</a>.
                        </div>
                        <div class="alert alert-warning">
                            Lorem ipsum dolor sit amet, consectetur adipisicing elit. <a href="#" class="alert-link">
                            Alert Link</a>.
                        </div>
                        <div class="alert alert-danger">
                            Lorem ipsum dolor sit amet, consectetur adipisicing elit. <a href="#" class="alert-link">
                            Alert Link</a>.
                        </div>
                    </div>
                        <!-- .panel-body -->
                </div>
                    <!-- /.panel -->
            </div>
                <!-- /.col-lg-6 -->
            <div class="col-lg-6">
                <div class="panel panel-default">
                    <div class="panel-heading">
                        Dismissable Alerts
                    </div>
                        <!-- /.panel-heading -->
                    <div class="panel-body">
                        <div class="alert alert-success alert-dismissable">
                            <button type="button" class="close" data-dismiss="alert" aria-hidden="true">&times;</button>
                            Lorem ipsum dolor sit amet, consectetur adipisicing elit. <a href="#" class="alert-link">
                            Alert Link</a>.
                        </div>
                        <div class="alert alert-info alert-dismissable">
                            <button type="button" class="close" data-dismiss="alert" aria-hidden="true">&times;</button>
                            Lorem ipsum dolor sit amet, consectetur adipisicing elit. <a href="#" class="alert-link">
                            Alert Link</a>.
                        </div>
                        <div class="alert alert-warning alert-dismissable">
                            <button type="button" class="close" data-dismiss="alert" aria-hidden="true">&times;</button>
                            Lorem ipsum dolor sit amet, consectetur adipisicing elit. <a href="#" class="alert-link">
                            Alert Link</a>.
                        </div>
                        <div class="alert alert-danger alert-dismissable">
                            <button type="button" class="close" data-dismiss="alert" aria-hidden="true">&times;</button>
                            Lorem ipsum dolor sit amet, consectetur adipisicing elit. <a href="#" class="alert-link">
                            Alert Link</a>.
                        </div>
                    </div>
                        <!-- .panel-body -->
                </div>
                    <!-- /.panel -->
            </div>
                <!-- /.col-lg-6 -->
        </div>
            <!-- /.row -->
        <div class="row">
            <div class="col-lg-6">
                <div class="panel panel-default">
                    <div class="panel-heading">
                        Modals
                    </div>
                        <!-- /.panel-heading -->
                    <div class="panel-body">
                            <!-- Button trigger modal -->
                        <button class="btn btn-primary btn-lg" data-toggle="modal" data-target="#myModal">
                            Launch Demo Modal
                        </button>
                            <!-- Modal -->
                        <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
                            <div class="modal-dialog">
                                <div class="modal-content">
                                    <div class="modal-header">
                                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                                        <h4 class="modal-title" id="myModalLabel">Modal title</h4>
                                    </div>
                                    <div class="modal-body">
                                        Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.
                                    </div>
                                    <div class="modal-footer">
                                        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                                        <button type="button" class="btn btn-primary">Save changes</button>
                                    </div>
                                </div>
                                    <!-- /.modal-content -->
                            </div>
                                <!-- /.modal-dialog -->
                        </div>
                            <!-- /.modal -->
                    </div>
                        <!-- .panel-body -->
                </div>
                    <!-- /.panel -->
            </div>
                <!-- /.col-lg-6 -->
            <div class="col-lg-6">
                <div class="panel panel-default">
                    <div class="panel-heading">
                        Tooltips and Popovers
                    </div>
                        <!-- /.panel-heading -->
                    <div class="panel-body">
                        <h4>Tooltip Demo</h4>
                        <div class="tooltip-demo">
                            <button type="button" class="btn btn-default" data-toggle="tooltip" data-placement="left" title="Tooltip on left">
                                Tooltip on left</button>
                            <button type="button" class="btn btn-default" data-toggle="tooltip" data-placement="top" title="Tooltip on top">
                                Tooltip on top</button>
                            <button type="button" class="btn btn-default" data-toggle="tooltip" data-placement="bottom" title="Tooltip on bottom">
                                Tooltip on bottom</button>
                            <button type="button" class="btn btn-default" data-toggle="tooltip" data-placement="right" title="Tooltip on right">
                                Tooltip on right</button>
                        </div>
                        <br>
                        <h4>Clickable Popover Demo</h4>
                        <div class="tooltip-demo">
                            <button type="button" class="btn btn-default" data-container="body" data-toggle="popover" data-placement="left" data-content="Vivamus sagittis lacus vel augue laoreet rutrum faucibus.">
                                Popover on left
                            </button>
                            <button type="button" class="btn btn-default" data-container="body" data-toggle="popover" data-placement="top" data-content="Vivamus sagittis lacus vel augue laoreet rutrum faucibus.">
                                Popover on top
                            </button>
                            <button type="button" class="btn btn-default" data-container="body" data-toggle="popover" data-placement="bottom" data-content="Vivamus sagittis lacus vel augue laoreet rutrum faucibus.">
                                Popover on bottom
                            </button>
                            <button type="button" class="btn btn-default" data-container="body" data-toggle="popover" data-placement="right" data-content="Vivamus sagittis lacus vel augue laoreet rutrum faucibus.">
                                Popover on right
                            </button>
                        </div>
                    </div>
                        <!-- .panel-body -->
                </div>
                    <!-- /.panel -->
            </div>
                <!-- /.col-lg-6 -->
        </div>
            <!-- /.row -->
    </div>
        <!-- /#page-wrapper -->
        <!-- Page-Level Demo Scripts - Notifications - Use for reference -->
    <script>
            // tooltip demo
            $('.tooltip-demo').tooltip("""),format.raw/*161.40*/("""{"""),format.raw/*161.41*/("""
                """),format.raw/*162.17*/("""selector: "[data-toggle=tooltip]",
                container: "body"
            """),format.raw/*164.13*/("""}"""),format.raw/*164.14*/(""");
            // popover demo
            $("[data-toggle=popover]")
                    .popover()
    </script>
""")))}),format.raw/*169.2*/("""
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Aug 22 15:33:07 EAT 2018
                  SOURCE: /home/mingina/Projects/uwanja/app/views/sendNotifications.scala.html
                  HASH: c628eea7d201f64563e94c77b5b4c117d40832c4
                  MATRIX: 1042->1|1075->26|1114->28|1145->33|10610->9469|10640->9470|10686->9487|10796->9568|10826->9569|10973->9685
                  LINES: 33->1|33->1|33->1|34->2|193->161|193->161|194->162|196->164|196->164|201->169
                  -- GENERATED --
              */
          