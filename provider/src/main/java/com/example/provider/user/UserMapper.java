package com.example.provider.user;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.common.pojo.po.User;
import org.springframework.stereotype.Repository;

/**
 * @author wtk
 * @date 2022-03-20
 */
@Repository
public interface UserMapper extends BaseMapper<User> {
}
