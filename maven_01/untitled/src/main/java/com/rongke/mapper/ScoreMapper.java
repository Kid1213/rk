package com.rongke.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.rongke.pojo.Score;
import jakarta.servlet.http.PushBuilder;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ScoreMapper extends BaseMapper<Score> {
}
