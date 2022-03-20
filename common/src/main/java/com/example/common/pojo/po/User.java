package com.example.common.pojo.po;

import com.baomidou.mybatisplus.annotation.TableName;
import com.example.common.pojo.IdentifiedEntity;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

/**
 * @author wtk
 * @since 2022-01-05
 */
@Setter
@Getter
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = false)
@TableName("user")
public class User extends IdentifiedEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 用户名
     */
    private String username;

    /**
     * 邮箱注册
     */
    private String email;

    /**
     * 密码
     */
    private String password;

    /**
     * 昵称
     */
    private String nickname;

    /**
     * 生日
     */
    private Date birthday;

    /**
     * 性别
     */
    private Boolean sex;

    /**
     * 用户头像路径
     */
    private String avatar;

    /**
     * 高中/大学/教师/其他
     */
    private Integer userType;

    /**
     * 获赞数
     */
    private Integer likedCount;

    /**
     * 收藏数
     */
    private Integer collectedCount;

    /**
     * 在读学校/毕业学校
     */
    private String school;

    /**
     * 选课/专业
     */
    private String major;
}
