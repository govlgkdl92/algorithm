package org.practice;

import org.success.DivisionOne;

public class Main {

    public static void main(String[] args) {
        KArray quiz = new KArray();

        int[] arr = {1, 5, 2, 6, 3, 7, 4};
        int[][] arr2 = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        int[] solution = quiz.solution(arr, arr2);

/*        System.out.println();
        for (int i = 0; i < solution.length; i++) {
            System.out.print("KArray["+i+"]: "+solution[i] + " ");
        }*/

        //---------------------------------------------------------------
        Minority quiz2 = new Minority();

        int[] arr3 = {1,2,7,6,4};
        int solution2 = quiz2.solution(arr3);

/*        System.out.println();
        System.out.println("Minority: "+solution2);*/
        //---------------------------------------------------------------
        Lotto quiz3 = new Lotto();

        int[] lottos = {44, 1, 0, 0, 31, 25};
        int[] win_nums = {31, 10, 45, 1, 6, 19};
        int[] solution3 = quiz3.solution(lottos, win_nums);

  /*      System.out.println();
  /*      System.out.println();
        for (int i = 0; i < solution3.length; i++) {
            System.out.print("Lotto["+i+"]: "+solution3[i] + " ");
        }*/

        //---------------------------------------------------------------
        Doll quiz4 = new Doll();

        int[][] board ={{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
        int[] moves = {1,5,3,5,1,2,1,4};
        int solution4 = quiz4.solution(board, moves);

        System.out.println();
        System.out.println("Doll: "+solution4);





    }

}
