package com.qixiafei.springcloud.server.a.api;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * <P>Description: . </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   </P>
 * <P>CREATE DATE: 2019/7/16 17:40</P>
 * <P>UPDATE DATE: </P>
 *
 * @author 齐霞飞
 * @version 1.0
 * @since java 1.8.0
 */
@Slf4j
@RestController
@RequestMapping("api")
public class HelloController {

    @Resource
    private DiscoveryClient discoveryClient;

    @GetMapping("hello")
    public String hello(String a ,String b) {
        List<String> services = discoveryClient.getServices();
        log.info("hello接口请求,services={}", services);
        return "Hello world";
    }
}
