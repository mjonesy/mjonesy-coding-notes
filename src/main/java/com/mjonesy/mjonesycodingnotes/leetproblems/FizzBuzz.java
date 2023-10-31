package com.mjonesy.mjonesycodingnotes.leetproblems;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/fizz-buzz/
public class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        List<String> answer = new ArrayList<>(n);

        for (int i = 1; i <= n; i++) {
            boolean divByThree = i % 3 == 0;
            boolean divByFive = i % 5 == 0;
            String word = "";

            if (divByThree) {
                word += "Fizz";
            }

            if (divByFive) {
                word += "Buzz";
            }

            if (word.isEmpty()) {
                word += String.valueOf(i);
            }
            answer.add(word);
        }

        return answer;
    }
}
