package com.wan.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author wanxf
 */
@Data
public class UserEntity implements Serializable {
    private Long id;
    private String guid;
    private String name;
    private String age;
    private Date createTime;
}
