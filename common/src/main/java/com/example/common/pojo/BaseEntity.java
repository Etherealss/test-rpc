package com.example.common.pojo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author wtk
 * @date 2022-02-21
 */
@Data
public abstract class BaseEntity implements Serializable {
    /**
     * 创建时间
     */
    protected Date createTime;
    /**
     * 修改时间
     */
    protected Date updateTime;
}
