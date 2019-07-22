package com.arts.service.convert.controller;

import com.arts.service.pojo.bo.TestBO;
import com.arts.service.pojo.vo.TestVO;

/**
 * TestConvert-controller层转换类
 * <p>
 * 1.
 * </p>
 *
 * @author : system
 * @version : 1.0.0
 * @date : 2019-07-19 16:03:12
 */
public final class TestConvert {

    public static TestVO boConvertVo(TestBO testBo) {
        TestVO testVO = new TestVO();
        testVO.setName(testBo.getName());
        testVO.setResult("成功");
        return testVO;
    }
}