/**@author: Mingina
 * @date: july 2018
 **/

package controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import models.*;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

import java.util.Date;
import java.util.List;

public class HomeworkAssignment extends Controller {


//    public Result assignHomework(SubjectRef subjectRef, String additionalInfo,
//                                 Date submissionDate) {
//        Date today = new Date();
//        Homework homework = new Homework();
////        Classroom assignedClass = new Classroom();
//
//        homework.setSubjectRef(subjectRef);
////        if(assignedToClass){
////             assignedClass = homework.getAssignedClass();
////        }
//
//        homework.setAdditionalInfo(additionalInfo);
//        homework.setSubmissionDate(submissionDate);
//        try{
//            homework.save();
//        }catch (Exception exception){
//            exception.printStackTrace();
//        }
//
//
//
//        return ok(views.html.homeworkAssignment.render());
//    }

    public Result createHomework(){
        Homework homework = new Homework();
        return ok(views.html.homeworkAssignment.render());
    }

    public Result assignHomework(){
        ObjectNode homeworkNode = (ObjectNode) request().body().asJson();
        ObjectMapper homeworkMapper = new ObjectMapper();
        Homework homework = new Homework();
        Teacher teacher = Teacher.teacherFinder.byId(homeworkNode.get("assigningTeacher").asText());
        SubjectRef subjectRef = SubjectRef.subjectFinder.byId(homeworkNode.get("subjectRef").asText());



        homework.setAssigningTeacher(teacher);
        homework.setSubjectRef(subjectRef);

        return ok();
    }
}
