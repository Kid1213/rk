package com.rongke.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * @author 76149
 */
@Data
@TableName("student")
public class Student {
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    private String sname;
    private Integer age;
    private Character sex;
    private String birthday;
    private String major;
    private String sno;

}
