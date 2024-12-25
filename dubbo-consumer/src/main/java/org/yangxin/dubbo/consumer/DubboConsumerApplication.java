package org.yangxin.dubbo.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;
import org.yangxin.dubbo.service.HelloServiceAPI;

/**
 * @author yangxin
 * 2024/6/16 16:37
 */
@SpringBootApplication
@ImportResource(locations = {"classpath:applicationContext-dubbo.xml"})
public class DubboConsumerApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(DubboConsumerApplication.class, args);
        HelloServiceAPI producerService = context.getBean("producerService", HelloServiceAPI.class);

        String message = "hello world";
        System.out.println(producerService.sayHello(message));
    }
}
