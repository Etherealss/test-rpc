package com.example.requester.resttemplate;

import com.example.common.pojo.po.User;
import com.example.requester.common.constant.Constants;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author wtk
 * @date 2022-03-20
 */
@Service
@AllArgsConstructor
public class RestTemplateService {
    private RestTemplate restTemplate;
    public List<User> findAll() {
        User[] templates = restTemplate.getForObject(
                "http://localhost:8080/users", User[].class);
        if (templates == null) {
            return new ArrayList<>(0);
        } else {
            return Arrays.asList(templates);
        }
    }
}
