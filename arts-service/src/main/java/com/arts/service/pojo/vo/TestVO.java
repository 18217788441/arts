package com.arts.service.pojo.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


/**
 * TestVO
 * <p>
 * 1.命名规范 xxxVO 例：UserVO dao层 出参 service,biz层 出参 control 出参
 * </p>
 *
 * @author : system
 * @version : 1.0.0
 * @date : 2019-07-19 16:03:12
 */
@Getter
@Setter
@ToString
public class TestVO {

    private String name;
    private String result;
}