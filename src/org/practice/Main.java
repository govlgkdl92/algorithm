package org.practice;

import org.success.DivisionOne;

public class Main {

    public static void main(String[] args) {
        KArray quiz = new KArray();
        Minority quiz2 = new Minority();
        Lotto quiz3 = new Lotto();

        int[] arr = {1, 5, 2, 6, 3, 7, 4};
        int[][] arr2 = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        int[] arr3 = {1,2,7,6,4};

        int[] lottos = {44, 1, 0, 0, 31, 25};
        int[] win_nums = {31, 10, 45, 1, 6, 19};

        int[] solution = quiz.solution(arr, arr2);
        int solution2 = quiz2.solution(arr3);
        int[] solution3 = quiz3.solution(lottos, win_nums);

        System.out.println();
        for (int i = 0; i < solution3.length; i++) {
            System.out.print("Lotto["+i+"]: "+solution3[i] + " ");
        }

/*        System.out.println();
        for (int i = 0; i < solution.length; i++) {
            System.out.print("KArray["+i+"]: "+solution[i] + " ");
        }

        System.out.println();
        System.out.println("Minority: "+solution2);*/
    }

}
