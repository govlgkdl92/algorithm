package org.practice;

import org.success.Insufficient;

public class Main {

    public static void main(String[] args) {
        TwoSum quiz = new TwoSum();

        int price = 3;
        int money = 20;
        int count = 4;
        int[] arr = {5, 0, 2, 7};
        int[] answers = {1, 2, 3, 4, 5, 2, 3, 4, 5, 5};

        int[] solution = quiz.solution(arr);

        System.out.println(solution);

        for (int i = 0; i < solution.length; i++) {
            System.out.print(solution[i] + " ");
        }
    }

}
