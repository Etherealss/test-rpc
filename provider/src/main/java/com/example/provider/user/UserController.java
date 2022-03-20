package com.example.provider.user;

import com.example.common.pojo.po.User;
import com.example.common.service.UserService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * @author wtk
 * @date 2022-03-20
 */
@Slf4j
@RestController
@AllArgsConstructor
@RequestMapping("/users")
public class UserController {

    private UserService userService;
    @GetMapping
    public List<User> findAll() {
        System.out.println("Controller我调用");
        return userService.findAll();
    }
}
