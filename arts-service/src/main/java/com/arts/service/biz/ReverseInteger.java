package com.arts.service.biz;

/**
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转
 * https://leetcode-cn.com/problems/reverse-integer/
 * <p>
 * 1.假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−231,  231 − 1]。请根据这个假设，如果反转后整数溢出那么就返回 0。
 * </p>
 *
 * @author : wukong
 * @version : 1.0.0
 * @date : 2019-07-29
 */
public interface ReverseInteger {

    /**
     * 利用数学方法反转 时间复杂度 O(log(x))
     * @param x int
     * @return int
     */
    int reverse(int x);
}
