package com.arts.service.convert.service;

import com.arts.service.pojo.bo.TestBO;
import com.arts.service.pojo.dto.TestDTO;

/**
 * TestConvert-service层转换类
 * <p>
 * 1.
 * </p>
 *
 * @author : system
 * @version : 1.0.0
 * @date : 2019-07-19 16:03:12
 */
public final class TestConvert {

    public static TestBO dtoConvertBo(TestDTO testDTO) {
        TestBO testBO = new TestBO();
        testBO.setAge(testDTO.getAge());
        testBO.setName(testDTO.getFirstName().concat(testDTO.getLastName()));
        return testBO;
    }
}