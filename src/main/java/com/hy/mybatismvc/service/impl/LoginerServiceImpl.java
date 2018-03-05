package com.hy.mybatismvc.service.impl;

import com.hy.mybatismvc.dao.LoginerDao;
import com.hy.mybatismvc.entity.Loginer;
import com.hy.mybatismvc.service.LoginerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    public void add(Loginer loginer) {
        loginerDao.insertLoginer(loginer);

    }
}
