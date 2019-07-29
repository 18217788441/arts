package com.arts.service.arts1;

import com.arts.service.biz.TwoSum;
import com.arts.service.biz.impl.TwoSumImpl;
import com.arts.service.handler.CostTimeHandler;
import java.util.Random;
import lombok.extern.slf4j.Slf4j;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

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
@Slf4j
public class TwoSumTest {


    private CostTimeHandler costTimeHandler = new CostTimeHandler();
    private TwoSum twoSumTest = (TwoSum) costTimeHandler.newProxyInstance(new TwoSumImpl());

    private int size = 10000000;
    private int[] nums = new int[size];
    private final int target = 9;

    @BeforeClass
    public void beforeClass() {
        long startTime = System.currentTimeMillis();
        System.out.println("开始执行");
        for (int i = 0; i < size; i++) {
            nums[i] = new Random().nextInt(1000);
        }
        System.out.println("数据加载完成：" + (System.currentTimeMillis() - startTime));

    }

    @Test
    public void twoSum() {
        print(twoSumTest.twoSum(nums, target), nums);
    }


    @Test
    public void twoSumMapToTwoForLoop() {
        print(twoSumTest.twoSumMapToTwoForLoop(nums, target), nums);
    }

    @Test
    public void twoSumMapToOneForLoop() {
        print(twoSumTest.twoSumMapToOneForLoop(nums, target), nums);
    }

    private void print(int[] array, int[] sourceArray) {
        StringBuilder stringBuilder = new StringBuilder()
                .append("first: ").append(array[0])
                .append(",second: ").append(array[1]);
        System.out.println(stringBuilder.toString());
        Assert.assertEquals(sourceArray[array[0]] + sourceArray[array[1]], target);
    }

}
