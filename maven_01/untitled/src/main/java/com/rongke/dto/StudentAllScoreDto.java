package com.rongke.dto;


import lombok.Data;


//按平均成绩从高到低显示所有学生的所有课程的成绩以及平均成绩
@Data
public class StudentAllScoreDto {
    private String sname;
    private String cname;
    private Integer score;
    private String sno;
    private Float avg;

}
