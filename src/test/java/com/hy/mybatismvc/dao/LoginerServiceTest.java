package com.hy.mybatismvc.dao;

import com.hy.mybatismvc.entity.Loginer;
import com.hy.mybatismvc.service.LoginerService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

import static org.junit.Assert.assertTrue;

/**
 * desc:登录用户数据库访问接口测试
 * @author hy
 * @version 1.0
 * @Created on 2018/3/5 11:54
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:conf/spring/spring.xml"})
public class LoginerServiceTest {

    @Autowired
    private LoginerService loginerService;

    private static final Logger logger = LoggerFactory.getLogger(LoginerServiceTest.class);


    @Test
    @Transactional
    @Rollback
    public void loginerTest() {
        Loginer loginer = new Loginer(100, "黄宇", "349284sdjfk");
        loginerService.add(loginer);
        Optional<Loginer> loginerDB = loginerService.selectById(100);
        assertTrue(loginerDB.isPresent());
        if (logger.isInfoEnabled()) {
            logger.info("数据库中查找到Loginer => {}", loginerDB);
        }
    }

}
