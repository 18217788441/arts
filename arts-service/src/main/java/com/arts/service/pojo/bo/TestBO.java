package com.arts.service.pojo.bo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * TestBO
 * <p>
 * 1.命名规范 xxxBO 例：UserBO dao层 入参，出参 service,biz层 入参，出参 control 禁用
 * </p>
 *
 * @author : system
 * @version : 1.0.0
 * @date : 2019-07-19 16:03:12
 */
@Setter
@Getter
@ToString
public class TestBO {

    private String name;
    private Integer age;
}