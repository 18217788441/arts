package com.arts.service.biz;

/**
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 * https://leetcode-cn.com/problems/palindrome-number/submissions/
 * <p>
 * 1.
 * </p>
 *
 * @author : wukong
 * @version : 1.0.0
 * @date : 2019/8/26
 */
public interface PalindromeNumber {

    /**
     * 是否是回文数
     * @param x int
     * @return boolean
     */
    boolean isPalindrome(int x);

    /**
     * 是否是回文数 二分法
     * @param x int
     * @return boolean
     */
    boolean isPalindromeByDichotomy(int x);
}
