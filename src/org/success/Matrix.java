package org.success;
/* 행렬의 덧셈
    행렬의 덧셈은 행과 열의 크기가 같은 두 행렬의 같은 행, 같은 열의 값을 서로 더한 결과가 됩니다.
    2개의 행렬 arr1과 arr2를 입력받아, 행렬 덧셈의 결과를 반환하는 함수, solution을 완성해주세요.

    제한 조건
    행렬 arr1, arr2의 행과 열의 길이는 500을 넘지 않습니다.
    입출력 예
    arr1	arr2	return
    [[1,2],[2,3]]	[[3,4],[5,6]]	[[4,6],[7,9]]
    [[1],[2]]	[[3],[4]]	[[4],[6]].*/

import java.util.Arrays;

public class Matrix {
    public static int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = {};

        int i , j =0;
        answer = new int[arr1.length][];

        for (i = 0; i < arr1.length; i++) {
            answer[i] = new int[arr1[i].length];
            for (j = 0; j <arr1[i].length; j++) {
                answer[i][j] = arr1[i][j] +arr2[i][j];
            }
        }
        return answer;
    }


        //main
        public static void main(String[] args) {
            int[][] a = {{1,3,2},{3,4}};
            int[][] b = {{1,2,2},{3,4}};
            int[][] solution = solution(a,b);
            System.out.println(Arrays.deepToString(solution));
        }


}




