package com.rongke.dto;


import lombok.Data;

//查询两门及其以上不及格（小于60分）课程的同学的学号，姓名及其平均成绩
@Data
public class FailedStudentDto {
    private String sno;
    private String sname;
    private Float avg;
}
