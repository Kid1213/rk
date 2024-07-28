package com.rongke.servie.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.rongke.mapper.CourseMapper;
import com.rongke.pojo.Course;
import com.rongke.servie.CourseService;
import org.springframework.stereotype.Service;


@Service
public class CourseMapperImpl extends ServiceImpl<CourseMapper, Course> implements CourseService {
}
