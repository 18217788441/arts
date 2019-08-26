package com.arts.service.biz.impl;

import com.arts.service.biz.PalindromeNumber;

/**
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 * <p>
 * 1.
 * </p>
 *
 * @author : wukong
 * @version : 1.0.0
 * @date : 2019/8/26
 */
public class PalindromeNumberImpl implements PalindromeNumber {


    /**
     * 是否是回文数
     *
     * @param x int
     * @return boolean
     */
    @Override
    public boolean isPalindrome(int x) {
        int oldInt = x;
        int newInt = 0;
        if(x < 0 || (x % 10 == 0)) {
            return false;
        }
        while (x != 0) {
            int pop = x % 10;
            newInt = newInt * 10 + pop;
            x=x / 10;
        }
        return newInt==oldInt;
    }

    /**
     * 是否是回文数
     *
     * @param x int
     * @return boolean
     */
    @Override
    public boolean isPalindromeByDichotomy(int x) {
        int newInt = 0;
        if(x < 0 || (x % 10 == 0)) {
            return false;
        }
        while (x >newInt) {
            newInt = newInt * 10 + x % 10;
            x/=10;
        }
        return x == newInt/10|| x == newInt ;
    }
}
