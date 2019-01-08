
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

object homeworkAssignment extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.2*/main("Homework Assignment")/*2.29*/ {_display_(Seq[Any](format.raw/*2.31*/("""

    """),format.raw/*4.5*/("""<div id="page-wrapper">
        <div class="row">
            <div class="col-lg-12">
                <h1 class="page-header"> Assign Homework </h1>
            </div>
                <!-- /.col-lg-12 -->
        </div>
            <!-- /.row -->
        <div class="row">
            <div class="col-lg-12">
                <div class="panel panel-default">
                    <div class="panel-heading">
                        Homework
                    </div>
                    <div class="panel-body">
                        <div class="row">
                            <div class="col-lg-12">
                                <form role="form">
                                    <div class="form-group">
                                        <label>Subject </label>
                                        <select class="form-control">
                                            <option></option>
                                            <option></option>
                                            <option></option>
                                            <option>4</option>
                                            <option>5</option>
                                        </select>
                                    </div>
                                    <div class="form-group">
                                        <label>Book</label>
                                        <select class="form-control">
                                            <option>1</option>
                                            <option>2</option>
                                            <option>3</option>
                                            <option>4</option>
                                            <option>5</option>
                                        </select>
                                    </div>
                                    <div class="form-group">
                                        <label>Page Number</label>
                                        <input class="form-control">
                                    </div>
                                    <div class="form-group">
                                        <label>Exercise Number</label>
                                        <input class="form-control" placeholder="e.g Exercise 2.1">
                                    </div>
                                    <div class="form-group">
                                        <label>Additional information concerning the exercise</label>
                                        <textarea class="form-control" rows="3"></textarea>
                                    </div>
                                    <div class="form-group">
                                        <label>Assigned To</label>
                                        <div class="checkbox">
                                            <label class="checkbox-inline">
                                                <input type="checkbox" value="">Entire Class
                                            </label>
                                        </div>
                                    </div>

                                    <div class="form-group">
                                        <label>Students</label>
                                        <select multiple class="form-control">
                                            <option>1</option>
                                            <option>2</option>
                                            <option>3</option>
                                            <option>4</option>
                                            <option>5</option>
                                        </select>
                                    </div>

                                    <div class="form-group">
                                        <label>Submission Date</label>
                                        <input type="date" id="deadline" name="assignmentDeadline"
                                        value="2018-07-22"
                                        min="2018-01-01" max="2018-12-31" />
                                    </div>
                                    <button type="submit" class="btn btn-default">Submit Button</button>
                                    <button type="reset" class="btn btn-default">Reset Button</button>
                                </form>
                            </div>

                        </div>
                            <!-- /.row (nested) -->
                    </div>
                        <!-- /.panel-body -->
                </div>
                    <!-- /.panel -->
            </div>
                <!-- /.col-lg-12 -->
        </div>
            <!-- /.row -->
    </div>
        <!-- /#page-wrapper -->

""")))}))
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
                  SOURCE: /home/mingina/Projects/uwanja/app/views/homeworkAssignment.scala.html
                  HASH: baf02074ef391577831f3db035a5aed766b89edd
                  MATRIX: 1043->2|1078->29|1117->31|1149->37
                  LINES: 33->2|33->2|33->2|35->4
                  -- GENERATED --
              */
          