package org.success;
/*      정수를 내림차순으로 배치하기
        함수 solution은 정수 n을 매개변수로 입력받습니다. 
        n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요. 
        예를들어 n이 118372면 873211을 리턴하면 됩니다.*/

import java.util.Arrays;
import java.util.Collections;

public class Desc {
    public static long solution(long n) {
        String[] str = String.valueOf(n).split("");
        Long[] number = new Long[str.length];

        for (int i = 0; i < str.length; i++) {
            number[i] = Long.parseLong(str[i]);
        }

        Arrays.sort(number, Collections.reverseOrder());

        String answer = "";
        for (int i = 0; i < number.length; i++) {
            answer = answer + number[i];
        }

        return Long.parseLong(answer);
    }



    //main
    public static void main(String[] args) {
        long a = 24324399;
        long solution = solution(a);
        System.out.println(solution);
    }
}
