package com.arts.service.pojo.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * TestDTO
 * <p>
 * 1.命名规范 xxxDTO 例：UserDTO dao层 入参 service,biz层 入参 control 入参
 * </p>
 *
 * @author : system
 * @version : 1.0.0
 * @date : 2019-07-19 16:03:12
 */
@Getter
@Setter
@ToString
public class TestDTO {

    private String lastName;
    private String firstName;
    private Integer age;
}