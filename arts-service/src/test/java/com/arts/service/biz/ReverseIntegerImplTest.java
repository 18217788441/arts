package com.arts.service.biz;

import static org.testng.Assert.*;

import com.arts.service.Base;
import com.arts.service.biz.ReverseInteger;
import com.arts.service.biz.TwoSum;
import com.arts.service.biz.impl.ReverseIntegerImpl;
import com.arts.service.biz.impl.TwoSumImpl;
import com.arts.service.handler.CostTimeHandler;
import groovy.util.logging.Slf4j;
import org.testng.annotations.Test;
import sun.java2d.pipe.SpanIterator;

/**
 * <p>
 * 1.
 * </p>
 *
 * @author : wukong
 * @version : 1.0.0
 * @date : 2019-07-29
 */
@Slf4j
public class ReverseIntegerImplTest {

    private ReverseInteger reverseInteger = (ReverseInteger) new CostTimeHandler().newProxyInstance(new ReverseIntegerImpl());
    private static final int TARGET = 1534236469;
    @Test
    public void testReverse() {
        System.out.println(reverseInteger.reverse(TARGET));
    }
}