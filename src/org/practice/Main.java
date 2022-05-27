package org.practice;

import org.success.DivisionOne;

public class Main {

    public static void main(String[] args) {
        KArray quiz = new KArray();
        DivisionOne divisionOne = new DivisionOne();

        int[] arr = {1, 5, 2, 6, 3, 7, 4};
        int[][] arr2 = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        int[] solution = quiz.solution(arr, arr2);

        System.out.println();
        for (int i = 0; i < solution.length; i++) {
            System.out.print("KArray["+i+"]: "+solution[i] + " ");
        }
    }

}
