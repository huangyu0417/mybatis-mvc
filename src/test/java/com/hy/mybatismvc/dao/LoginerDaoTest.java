package com.hy.mybatismvc.dao;

import com.hy.mybatismvc.entity.Loginer;
import com.hy.mybatismvc.service.LoginerService;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * desc:登录用户数据库访问接口测试
 * @author hy
 * @version 1.0
 * @Created on 2018/3/5 11:54
 */
public class LoginerDaoTest {

    private LoginerService loginerService;

    @Before
    public void init() {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:conf/spring/spring.xml");
        loginerService = context.getBean(LoginerService.class);
    }

    @Test
    @Ignore
    public void lombokTest() {
        Loginer loginer = new Loginer(100, "黄宇", "349284sdjfk");
        System.out.println(loginer);
    }

    @Test
    public void loginerTest() {
        Loginer loginer = new Loginer(100, "黄宇", "349284sdjfk");
        loginerService.add(loginer);
    }

    @After
    public void clean() {
    }
}
