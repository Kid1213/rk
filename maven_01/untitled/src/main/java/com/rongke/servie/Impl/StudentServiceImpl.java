package com.rongke.servie.Impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.rongke.mapper.StudentMapper;
import com.rongke.pojo.Student;
import com.rongke.servie.StudentService;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements StudentService {
}
