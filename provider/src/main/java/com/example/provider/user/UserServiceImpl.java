package com.example.provider.user;

import com.example.common.pojo.po.User;
import com.example.common.service.UserService;
import lombok.AllArgsConstructor;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wtk
 * @date 2022-03-20
 */
@Service
@AllArgsConstructor
@DubboService(interfaceClass = UserService.class)
public class UserServiceImpl implements UserService {
    private final UserMapper userMapper;
    @Override
    public List<User> findAll() {
        System.out.println("Service被调用");
        return userMapper.selectList(null);
    }
}
