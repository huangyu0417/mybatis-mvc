package com.hy.mybatismvc.service;

import com.hy.mybatismvc.entity.Loginer;

import java.util.Optional;

/**
 * desc:登录用户服务
 * @author hy
 * @version 1.0
 * @Created on 2018/3/5 17:29
 */
public interface LoginerService {

    void add(Loginer loginer);

    void delete(int id);

    Optional<Loginer> selectById(int id);

}
