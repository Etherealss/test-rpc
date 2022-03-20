package com.example.requester.openfeign;

import com.example.common.pojo.po.User;
import com.example.requester.common.constant.Constants;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @author wtk
 * @date 2022-03-20
 */
@Service
@FeignClient(name = "development-platform", url = "http://localhost:8080")
public interface OpenFeignService {

    @GetMapping("/users")
    List<User> findAll();
}
