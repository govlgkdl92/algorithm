package org.practice;

public class Main {

    public static void main(String[] args) {
        ArrayString arrayString = new ArrayString();

        String[] n = {"sun", "bed", "car"};
        int m = 1;

        int[] answers = {1, 2, 3, 4, 5, 2, 3, 4, 5, 5};
        String[] solution = arrayString.solution(n, m);

        for (int i = 0; i < solution.length; i++) {
            System.out.print(solution[i] + " ");
        }
    }
}
