package org.practice;

import org.success.DivisionOne;

public class Main {

    public static void main(String[] args) {
        KArray quiz = new KArray();
        Minority quiz2 = new Minority();

        int[] arr = {1, 5, 2, 6, 3, 7, 4};
        int[][] arr2 = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        int[] arr3 = {1,2,7,6,4};

        int[] solution = quiz.solution(arr, arr2);
        int solution2 = quiz2.solution(arr3);

        System.out.println();
        for (int i = 0; i < solution.length; i++) {
            System.out.print("KArray["+i+"]: "+solution[i] + " ");
        }

        System.out.println();
        System.out.println("Minority: "+solution2);
    }

}
