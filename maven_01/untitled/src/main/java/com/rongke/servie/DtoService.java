package com.rongke.servie;

import com.rongke.dto.*;

import java.util.List;

public interface DtoService {

    List<EachCourseScoreDto> getEachCourseScore();

    List<FailedStudentDto> getFailedStudent();

    List<StudentAllScoreDto> getStudentAllScore();

    List<StudentTotalScoreDto> getStudentTotalScore();

    List<SubjectScoreDto> getSubjectScore();


}
