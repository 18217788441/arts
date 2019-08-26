package com.arts.service.biz;

import com.arts.service.Base;
import com.arts.service.biz.impl.PalindromeNumberImpl;
import com.arts.service.biz.impl.ReverseIntegerImpl;
import com.arts.service.handler.CostTimeHandler;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * <p>
 * 1.
 * </p>
 *
 * @author : wukong
 * @version : 1.0.0
 * @date : 2019/8/26
 */
public class PalindromeNumberImplTest{
    private PalindromeNumber palindromeNumber = (PalindromeNumber) new CostTimeHandler().newProxyInstance(new PalindromeNumberImpl());
    @Test
    public void testIsPalindrome() {
        System.out.println(palindromeNumber.isPalindrome(10));
        System.out.println(palindromeNumber.isPalindromeByDichotomy(10));
    }
}