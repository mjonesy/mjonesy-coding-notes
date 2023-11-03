package com.mjonesy.mjonesycodingnotes.leetproblems;

//https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
public class NumberOfStepsReduceNumberToZero {
    public int numberOfSteps(int num) {
        int steps = 0;

        while (num > 0) {
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num--;
            }
            steps++;
        }

        return steps;
    }

    public int numberOfStepsBitwiseSolution(int num) {
        int steps = 0;

        while (num > 0) {
            // Before we used num % 2
            if ((num & 1) == 0 ) { // num: xxxxxxx0 7 bitmask: 00000001
                // Before we used num /= 2
                // num = num >> 1; // right shift, return all bits shifted to the right position 1 position
                num >>= 1;
            } else {
                num--;
            }
            steps++;
        }

        return steps;
    }
}
