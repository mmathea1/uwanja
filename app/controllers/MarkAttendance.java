package controllers;


import com.mysql.jdbc.PreparedStatement;
import io.ebeaninternal.server.lib.util.Str;
import models.Attendance;
import models.Student;
import play.mvc.Controller;
import play.mvc.Result;

import java.util.*;

public class MarkAttendance extends Controller {

    private List<Student> studentList = Student.finder.all().subList(5, 20);

    private Student getStudent = new Student();


    public Result getClassList() {

        for(Student student : studentList){
//            if(student.getStudentId().isEmpty()){
//                studentList.remove(student);
//            }else{
                getStudent = student;
//            }



        }
        return ok(views.html.markAttendance.render(getStudent, studentList));
    }

    public Result confirmAttendance(){
        System.out.println("CONFIRMING.....");

        Attendance attendance = new Attendance();

        attendance.setAttendanceDate(new Date());
        attendance.setStudentId(getStudent);
        attendance.setAttended(true);


        return ok();
    }
}
