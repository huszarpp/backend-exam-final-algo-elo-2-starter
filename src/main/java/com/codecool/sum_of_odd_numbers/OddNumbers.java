package com.codecool.sum_of_odd_numbers;

import java.util.List;

class OddNumbers {

    static Integer sum(List<Integer> numbers) {

        int sumOfOddNumbers = 0;

        for (int number : numbers) {
            if (Math.abs(number % 2) == 1) {
                sumOfOddNumbers += number;
            }
        }

        return sumOfOddNumbers;
    }
}