package com.rongke.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;


@Data
@TableName("course")
public class Course {
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    private String cname;
    private Float credit;
}
