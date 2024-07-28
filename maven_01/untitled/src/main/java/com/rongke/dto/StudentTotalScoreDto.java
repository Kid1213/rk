package com.rongke.dto;


import lombok.Data;

//统计学生总成绩排名，成绩相同按名称正序排序，显示姓名，性别，学号
@Data
public class StudentTotalScoreDto {
    private String sname;
    private Integer score;
    private String sno;
    private Integer totalScore;

}
