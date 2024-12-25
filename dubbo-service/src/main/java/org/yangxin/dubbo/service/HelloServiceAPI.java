package org.yangxin.dubbo.service;

/**
 * @author yangxin
 * 2024/6/15 14:20
 */
public interface HelloServiceAPI {

    /**
     * 传入一个 Message，增加 Hello 的回复
     *
     * @param message 消息
     * @return 回复
     */
    String sayHello(String message);
}
