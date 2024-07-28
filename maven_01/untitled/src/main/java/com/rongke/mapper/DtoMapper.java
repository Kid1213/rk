package com.rongke.mapper;

import com.rongke.dto.*;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface DtoMapper {


    //查询各科成绩最高分、最低分和平均分
    @Select("")
    List<EachCourseScoreDto> getEachCourseScore();

    //查询两门及其以上不及格（小于60分）课程的同学的学号，姓名及其平均成绩
    @Select("")
    List<FailedStudentDto> getFailedStudent();

    //按平均成绩从高到低显示所有学生的所有课程的成绩以及平均成绩
    @Select("")
    List<StudentAllScoreDto> getStudentAllScore();

    //统计学生总成绩排名，成绩相同按名称正序排序，显示姓名，性别，学号
    @Select("")
    List<StudentTotalScoreDto> getStudentTotalScore();

    //查询各科成绩进行排名，成绩相同按名称正序排序，显示姓名，性别，学号
    @Select("")
    List<SubjectScoreDto> getSubjectScore();



}
