package com.example.requester.test;

import com.example.common.pojo.po.User;
import com.example.common.service.UserService;
import com.example.requester.common.constant.Constants;
import com.example.requester.openfeign.OpenFeignService;
import com.example.requester.resttemplate.RestTemplateService;
import lombok.AllArgsConstructor;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * @author wtk
 * @date 2022-03-20
 */
@Component
@AllArgsConstructor
public class Test {
    @DubboReference(url = "127.0.0.1:18080")
    private UserService userService;

    private RestTemplateService restTemplateService;
    private OpenFeignService openFeignService;

    @PostConstruct
    public void test() {
        List<User> users = dubbo();
        restTemplate();
        openFeign();
        users.forEach(System.out::println);
    }


    private List<User> dubbo() {
        return userService.findAll();
    }

    private List<User> restTemplate() {
        return restTemplateService.findAll();
    }

    private List<User> openFeign() {
        return openFeignService.findAll();
    }
}
