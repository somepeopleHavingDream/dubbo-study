package org.yangxin.dubbo.producer.impl;

import org.yangxin.dubbo.service.HelloServiceAPI;

/**
 * @author yangxin
 * 2024/6/15 14:22
 */
public class HelloServiceImpl implements HelloServiceAPI {

    @Override
    public String sayHello(String message) {
        return "Producer response: Hello " + message;
    }
}
