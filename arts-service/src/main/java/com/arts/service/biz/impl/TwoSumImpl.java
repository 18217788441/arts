package com.arts.service.biz.impl;

import com.arts.service.biz.TwoSum;
import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 *
 * <p>
 * 1.你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 * </p>
 *
 * @author : wukong
 * @version : 1.0.0
 * @date : 2019-07-19
 */
public class TwoSumImpl implements TwoSum {

    /**
     * 暴力破解法 时间复杂度 O(n^2)
     *
     * @param nums int[]
     * @param target int
     * @return int[]
     */
    @Override
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    /**
     * 两遍hash表 时间复杂度 O(2n)
     *
     * @param nums int[]
     * @param target int
     * @return int[]
     */
    @Override
    public int[] twoSumMapToTwoForLoop(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int second = target - nums[i];
            if (map.containsKey(second)) {
                return new int[]{i,map.get(second)};
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    /**
     * 一遍hash表 时间复杂度 O(n)
     *
     * @param nums int[]
     * @param target int
     * @return int[]
     */
    @Override
    public int[] twoSumMapToOneForLoop(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            int second = target - nums[i];
            if (map.containsKey(second)) {
                return new int[]{map.get(second),i };
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
