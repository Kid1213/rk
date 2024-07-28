package com.rongke.controller;


import com.rongke.dto.*;
import com.rongke.pojo.Student;
import com.rongke.servie.DtoService;
import com.rongke.servie.ScoreService;
import com.rongke.servie.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author 76149
 */
@RestController
@RequestMapping("student")
public class StudentController {
    @Autowired
    private ScoreService scoreService;
    @Autowired
    private StudentService studentService;
    @Autowired
    private DtoService dtoService;


    @GetMapping("eachScore")
    public List<EachCourseScoreDto> getEachScore() {
        return dtoService.getEachCourseScore();
    }
    @GetMapping("failedStudent")
    public List<FailedStudentDto> getFailedStudent() {
        return dtoService.getFailedStudent();
    }
    @GetMapping("allScore")
    public List<StudentAllScoreDto> getStudentAllScore() {
        return dtoService.getStudentAllScore();
    }
    @GetMapping("totalScore")
    public List<StudentTotalScoreDto> getTotalScore() {
        return dtoService.getStudentTotalScore();
    }
    @GetMapping("subjectScore")
    public List<SubjectScoreDto> getSubjectScore() {
        return dtoService.getSubjectScore();
    }

    @PostMapping("insert")
    public void insert(@RequestBody Student student) {
        studentService.save(student);
    }
    @DeleteMapping
    public void delete(@RequestBody  Student student) {
        studentService.removeById(student);
    }

}
