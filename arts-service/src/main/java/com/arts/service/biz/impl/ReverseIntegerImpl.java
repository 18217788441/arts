package com.arts.service.biz.impl;

import com.arts.service.biz.ReverseInteger;

/**
 * <p>
 * 1.
 * </p>
 *
 * @author : wukong
 * @version : 1.0.0
 * @date : 2019-07-29\
 */
public class ReverseIntegerImpl implements ReverseInteger {

    /**
     * 方法1
     *
     * @param x int
     * @return int
     */
    @Override
    public int reverse(int x) {
        int reslut = 0;
        while (x != 0) {
            int pop = x % 10;
            x=x / 10;
            if (reslut > Integer.MAX_VALUE/10 || (reslut == Integer.MAX_VALUE / 10 && pop > 7)){
                return 0;
            }
            if (reslut < Integer.MIN_VALUE/10 || (reslut == Integer.MIN_VALUE / 10 && pop < -8)){
                return 0;
            }
            reslut = reslut * 10 + pop;
        }
        return reslut;
    }
}
