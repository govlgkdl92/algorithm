package org.success;
/*      문자열 내림차순으로 배치하기
        문자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬해 새로운 문자열을 리턴하는 함수, solution을 완성해주세요.
        s는 영문 대소문자로만 구성되어 있으며, 대문자는 소문자보다 작은 것으로 간주합니다.

        str은 길이 1 이상인 문자열입니다.

        s	            return
        "Zbcdefg"	    "gfedcbZ"*/

import java.util.Arrays;
import java.util.Collections;

public class ArrayString2 {

    public String solution(String s) {
        String answer = "";
        String[] arr = s.split("");
        Arrays.sort(arr, Collections.reverseOrder());

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            answer = answer+arr[i];
        }

        return answer;
    }

    /*
    public static void main(String[] args) {
        ArrayString2 arrayString2 = new ArrayString2();

        String n = "pPoooyY";
        String m = "Zbcdefg";

        String solution = arrayString2.solution(m);
        System.out.println(solution);
    }*/
}
