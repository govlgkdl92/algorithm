package org.success;

import java.lang.reflect.Array;
import java.util.Arrays;

import static java.lang.Integer.MAX_VALUE;

/*문제 설명
        정수를 저장한 배열, arr 에서 가장 작은 수를 제거한 배열을 리턴하는 함수,
        solution을 완성해주세요. 단, 리턴하려는 배열이 빈 배열인 경우엔 배열에 -1을 채워 리턴하세요.
        예를들어 arr이 [4,3,2,1]인 경우는 [4,3,2]를 리턴 하고, [10]면 [-1]을 리턴 합니다.

        제한 조건
        arr은 길이 1 이상인 배열입니다.
        인덱스 i, j에 대해 i ≠ j이면 arr[i] ≠ arr[j] 입니다.*/
public class Cut {

    public static int[] solution(int[] arr) {
        int[] answer = new int[arr.length-1];
        int min = MAX_VALUE;
        int lay = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min){
                min = arr[i];
                lay = i;
            }
        }

        System.arraycopy(arr, 0, answer, 0, lay);
        System.arraycopy(arr, lay+1, answer, lay , arr.length-lay-1);

        if(answer.length == 0){
            answer = new int[1];
            answer[0] = -1;
        }

        return answer;
    }


    //main
    public static void main(String[] args) {
        int[] a = {15,3,9,6,1,8};
        int[] b = {7};
        int[] solution = solution(b);

        for (int i = 0; i < solution.length; i++) {
            System.out.print(solution[i]+" ");
        }

    }


}
