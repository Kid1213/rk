package com.rongke.pojo;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("score")
public class Score {
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    private Integer score;
    private Integer cid;
    private String sid;
}
