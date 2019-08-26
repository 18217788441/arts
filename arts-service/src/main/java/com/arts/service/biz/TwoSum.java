package com.arts.service.biz;

/**
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 * https://leetcode-cn.com/problems/two-sum/
 * <p>
 * 1.你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 * </p>
 *
 * @author : wukong
 * @version : 1.0.0
 * @date : 2019-07-19
 */
public interface TwoSum {

    /**
     * 暴力破解法 时间复杂度 O(n^2)
     *
     * @param nums int[]
     * @param target int
     * @return int[]
     */
    int[] twoSum(int[] nums, int target);

    /**
     * 两遍hash表 时间复杂度 O(2n)
     *
     * @param nums int[]
     * @param target int
     * @return int[]
     */
    int[] twoSumMapToTwoForLoop(int[] nums, int target);

    /**
     * 一遍hash表 时间复杂度 O(n)
     *
     * @param nums int[]
     * @param target int
     * @return int[]
     */
    int[] twoSumMapToOneForLoop(int[] nums, int target);
}
