package org.success;
/*      나누어 떨어지는 숫자 배열
        array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 함수, solution을 작성해주세요.
        divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환하세요.

        제한사항
        arr은 자연수를 담은 배열입니다.
        정수 i, j에 대해 i ≠ j 이면 arr[i] ≠ arr[j] 입니다.
        divisor는 자연수입니다.
        array는 길이 1 이상인 배열입니다.

        arr	divisor	return
        [5, 9, 7, 10]	5	[5, 10]
        [2, 36, 1, 3]	1	[1, 2, 3, 36]
        [3,2,6]	10	[-1]
        */

import java.util.Arrays;

public class NumberArray {
    public static int[] solution(int[] arr, int divisor) {
       int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%divisor == 0){
               count++;
            }
        }

        int[] answer = new int[count];
        count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%divisor == 0){
                answer[count]=arr[i];
                count++;
            }
        }

        Arrays.sort(answer);

        if(answer.length == 0){
            answer = new int[1];
            answer[0] = -1;
        }
        return answer;
    }

    //main
    public static void main(String[] args) {
        int[] n = {5, 9, 7, 10};
        int m = 53;
        int[] solution = solution(n, m);
        //System.out.println(solution);
        for (int i = 0; i < solution.length; i++) {
            System.out.print(solution[i]+", ");
        }


    }

}


/*
        if(divisor == 1){
            Arrays.sort(arr);
            return arr;
        }
        List<Integer> list = new ArrayList();

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%divisor == 0){
                list.add(arr[i]);
            }
        }

        int listSize = list.size();
        Integer[] result = list.toArray(new Integer[listSize]);

        int[] answer = Arrays.stream(result).mapToInt(i -> i).toArray();

        if(answer.length == 0){
            answer = new int[1];
            answer[0] = -1;
        }
        return answer;
* */
