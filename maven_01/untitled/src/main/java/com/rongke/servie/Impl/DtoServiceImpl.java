package com.rongke.servie.Impl;

import com.rongke.dto.*;
import com.rongke.mapper.DtoMapper;
import com.rongke.servie.DtoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class DtoServiceImpl implements DtoService {

    @Autowired
    private DtoMapper dtoMapper;

    @Override
    public List<EachCourseScoreDto> getEachCourseScore() {
        return dtoMapper.getEachCourseScore();
    }

    @Override
    public List<FailedStudentDto> getFailedStudent() {
        return dtoMapper.getFailedStudent();
    }

    @Override
    public List<StudentAllScoreDto> getStudentAllScore() {
        return dtoMapper.getStudentAllScore();
    }

    @Override
    public List<StudentTotalScoreDto> getStudentTotalScore() {
        return dtoMapper.getStudentTotalScore();
    }

    @Override
    public List<SubjectScoreDto> getSubjectScore() {
        return dtoMapper.getSubjectScore();
    }
}
