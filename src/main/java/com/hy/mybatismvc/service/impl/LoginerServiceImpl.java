package com.hy.mybatismvc.service.impl;

import com.hy.mybatismvc.dao.LoginerDao;
import com.hy.mybatismvc.entity.Loginer;
import com.hy.mybatismvc.service.LoginerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

/**
 * desc:
 *
 * @author hy
 * @version 1.0
 * @Created on 2018/3/5 17:38
 */
@Service
public class LoginerServiceImpl implements LoginerService {

    @Autowired
    private LoginerDao loginerDao;

    @Override
    @Transactional
    public void add(Loginer loginer) {
        loginerDao.insertLoginer(loginer);

    }

    @Override
    @Transactional
    public void delete(int id) {
        loginerDao.deleteLoginer(id);
    }

    @Override
    public Optional<Loginer> selectById(int id) {
        Loginer loginer = loginerDao.selectOne(id);
        return Optional.ofNullable(loginer);
    }


}
