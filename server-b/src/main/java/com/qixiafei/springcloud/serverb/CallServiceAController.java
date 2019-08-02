package com.qixiafei.springcloud.serverb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * <P>Description: . </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   </P>
 * <P>CREATE DATE: 2019/7/16 21:11</P>
 * <P>UPDATE DATE: </P>
 *
 * @author 齐霞飞
 * @version 1.0
 * @since java 1.8.0
 */
@RestController
@RequestMapping("call/serviceA")
public class CallServiceAController {

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("hello")
    public String hello() {
        return restTemplate.getForEntity("http://server-a/api/hello", String.class).getBody();
    }
}
