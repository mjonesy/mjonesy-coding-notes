package com.mjonesy.mjonesycodingnotes.leetproblems;

// https://leetcode.com/problems/richest-customer-wealth/description/
public class RichestCustomerWealth {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;

        for (int[] customer : accounts) {
            int accountMax = 0;

            for ( int bank : customer) {
                accountMax += bank;
            }

            if (accountMax > maxWealth) {
                maxWealth = accountMax;
            }
        }

        return maxWealth;
    }
}
