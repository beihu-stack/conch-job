package com.nabob.conch.job.worker;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * Worker BootStrap
 *
 * @author Adam
 * @date 2021/2/18
 */
public class Worker implements ApplicationContextAware, InitializingBean {

    @Override
    public void afterPropertiesSet() throws Exception {
        // 初始化
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        // spring上下文
    }
}
