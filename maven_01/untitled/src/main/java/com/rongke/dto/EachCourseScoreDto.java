package com.rongke.dto;


import lombok.Data;


//查询各科成绩最高分、最低分和平均分
@Data
public class EachCourseScoreDto {
    private String cname;
    private Integer max;
    private Integer min;
    private Float avg;
}
