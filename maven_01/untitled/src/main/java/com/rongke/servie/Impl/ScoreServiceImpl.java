package com.rongke.servie.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.rongke.mapper.ScoreMapper;
import com.rongke.pojo.Score;
import com.rongke.servie.ScoreService;
import org.springframework.stereotype.Service;



@Service
public class ScoreServiceImpl extends ServiceImpl<ScoreMapper, Score> implements ScoreService {
}
