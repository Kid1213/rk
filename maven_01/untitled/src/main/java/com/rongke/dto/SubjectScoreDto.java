package com.rongke.dto;


import lombok.Data;


//查询各科成绩进行排名，成绩相同按名称正序排序，显示姓名，性别，学号
@Data
public class SubjectScoreDto {
    private String cname;
    private String sname;
    private Integer score;
    private Character sex;

}
