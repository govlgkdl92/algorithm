package org.practice;

public class Main {

    public static void main(String[] args) {
        Insufficient quiz = new Insufficient();

        int price = 3;
        int money = 20;
        int count = 4;

        int[] answers = {1, 2, 3, 4, 5, 2, 3, 4, 5, 5};
        long solution = quiz.solution(price, money, count);

        System.out.println(solution);

        /*for (int i = 0; i < solution.length; i++) {
            System.out.print(solution[i] + " ");
        }*/
    }

}
