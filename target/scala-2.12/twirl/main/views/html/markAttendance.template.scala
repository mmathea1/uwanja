
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

object markAttendance extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Student,List[Student],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(student: Student, studentList: List[Student]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*3.2*/main("Mark Attendance")/*3.25*/ {_display_(Seq[Any](format.raw/*3.27*/("""


    """),format.raw/*6.5*/("""<div id="page-wrapper">
        <div class="row">
            <div class="col-lg-12">
                <h1 class="page-header"> Attendance Sheet </h1>
            </div>
                <!-- /.col-lg-12 -->
        </div>
            <!-- /.row -->
        <div class="row">
            <div class="col-lg-12">
                <div class="panel panel-default">
                    <div class="panel-heading">
                        <div class="sidebar-search">
                            <div class="input-group custom-search-form">
                                <input type="text" class="form-control" placeholder="Search for student...">
                                <span class="input-group-btn">
                                    <button class="btn btn-default" type="button">
                                        <i class="fa fa-search"></i>
                                    </button>
                                </span>
                            </div>
                                <!-- /input-group -->
                        </div>
                    </div>
                        <!-- /.panel-heading -->
                    <div class="panel-body">
                        <table width="100%" class="table table-striped table-bordered table-hover" id="dataTables-example">
                            <thead>
                                <tr>
                                    <th> Student Name </th>
                                    <th> Reg. Number </th>
                                    <th> Present </th>
                                </tr>
                            </thead>
                            <tbody>
                                """),_display_(/*41.34*/for(student <- studentList) yield /*41.61*/ {_display_(Seq[Any](format.raw/*41.63*/("""

                                    """),format.raw/*43.37*/("""<tr class="odd gradeX">
                                        <td>"""),_display_(/*44.46*/student/*44.53*/.getFirstName),format.raw/*44.66*/(""" """),_display_(/*44.68*/student/*44.75*/.getLastName),format.raw/*44.87*/("""</td>
                                        <td>"""),_display_(/*45.46*/student/*45.53*/.getStudentId),format.raw/*45.66*/("""</td>
                                        <td><input type="checkbox" class="attendanceClass" value=""""),_display_(/*46.100*/student/*46.107*/.getStudentId),format.raw/*46.120*/("""" checked id="studentChecked"></td>

                                    </tr>
                                """)))}),format.raw/*49.34*/("""


                            """),format.raw/*52.29*/("""</tbody>
                        </table>
                        <div class="col-lg-12">

                            """),format.raw/*56.105*/("""
                                """),format.raw/*57.33*/("""<button type="submit" class="btn btn-primary" onclick="getStudentAttendance()">
                                    Confirm Attendance</button>
                            """),format.raw/*59.40*/("""


                        """),format.raw/*62.25*/("""</div>
                    </div>
                        <!-- /.panel-body -->
                </div>
                    <!-- /.panel -->
            </div>
                <!-- /.col-lg-12 -->
        </div>
    </div>
        <!-- /#page-wrapper -->


    <script>

            $(document).ready(function () """),format.raw/*76.43*/("""{"""),format.raw/*76.44*/("""
                """),format.raw/*77.17*/("""$('#dataTables-example').DataTable("""),format.raw/*77.52*/("""{"""),format.raw/*77.53*/("""
                    """),format.raw/*78.21*/("""responsive: true
                """),format.raw/*79.17*/("""}"""),format.raw/*79.18*/(""");


            """),format.raw/*82.13*/("""}"""),format.raw/*82.14*/(""");
    </script>

    <script>
       function getStudentAttendance() """),format.raw/*86.40*/("""{"""),format.raw/*86.41*/("""
           """),format.raw/*87.12*/("""$( ".attendanceClass" ).each(function( index ) """),format.raw/*87.59*/("""{"""),format.raw/*87.60*/("""
               """),format.raw/*88.16*/("""// console.log( index + ": "  );
               console.log( index + ": ", $( this ) );

               var obj = $(this)[0];
               var reg = obj.value;
               if(obj.checked)"""),format.raw/*93.31*/("""{"""),format.raw/*93.32*/("""
                   """),format.raw/*94.20*/("""console.log("REGGGG", reg);
                   List attendanceList =
               """),format.raw/*96.16*/("""}"""),format.raw/*96.17*/("""
           """),format.raw/*97.12*/("""}"""),format.raw/*97.13*/(""");
         // console.log("EVEnt: ", event);

       """),format.raw/*100.8*/("""}"""),format.raw/*100.9*/("""








    """),format.raw/*109.5*/("""</script>

""")))}),format.raw/*111.2*/("""
"""))
      }
    }
  }

  def render(student:Student,studentList:List[Student]): play.twirl.api.HtmlFormat.Appendable = apply(student,studentList)

  def f:((Student,List[Student]) => play.twirl.api.HtmlFormat.Appendable) = (student,studentList) => apply(student,studentList)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Aug 22 15:33:07 EAT 2018
                  SOURCE: /home/mingina/Projects/uwanja/app/views/markAttendance.scala.html
                  HASH: 79a42d00f7f40c8968bdbcc5bb464dd3126e1908
                  MATRIX: 972->2|1112->50|1143->73|1182->75|1215->82|2942->1782|2985->1809|3025->1811|3091->1849|3187->1918|3203->1925|3237->1938|3266->1940|3282->1947|3315->1959|3393->2010|3409->2017|3443->2030|3576->2135|3593->2142|3628->2155|3771->2267|3830->2298|3978->2493|4039->2526|4239->2709|4294->2736|4634->3048|4663->3049|4708->3066|4771->3101|4800->3102|4849->3123|4910->3156|4939->3157|4984->3174|5013->3175|5111->3245|5140->3246|5180->3258|5255->3305|5284->3306|5328->3322|5548->3514|5577->3515|5625->3535|5737->3619|5766->3620|5806->3632|5835->3633|5917->3687|5946->3688|5987->3701|6030->3713
                  LINES: 28->2|33->3|33->3|33->3|36->6|71->41|71->41|71->41|73->43|74->44|74->44|74->44|74->44|74->44|74->44|75->45|75->45|75->45|76->46|76->46|76->46|79->49|82->52|86->56|87->57|89->59|92->62|106->76|106->76|107->77|107->77|107->77|108->78|109->79|109->79|112->82|112->82|116->86|116->86|117->87|117->87|117->87|118->88|123->93|123->93|124->94|126->96|126->96|127->97|127->97|130->100|130->100|139->109|141->111
                  -- GENERATED --
              */
          