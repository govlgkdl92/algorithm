package org.success;
/*      문자열 내 마음대로 정렬하기
        문자열로 구성된 리스트 strings 와, 정수 n이 주어졌을 때, 각 문자열의 인덱스 n번째 글자를 기준으로 오름차순 정렬하려 합니다.
        예를 들어 strings 가 ["sun", "bed", "car"]이고 n이 1이면 각 단어의 인덱스 1의 문자 "u", "e", "a"로 strings 를 정렬합니다.

        [제한 조건]
        strings 는 길이 1 이상, 50이하인 배열입니다.
        strings 의 원소는 소문자 알파벳으로 이루어져 있습니다.
        strings 의 원소는 길이 1 이상, 100이하인 문자열입니다.
        모든 strings 의 원소의 길이는 n보다 큽니다.
        인덱스 1의 문자가 같은 문자열이 여럿 일 경우, 사전순으로 앞선 문자열이 앞쪽에 위치합니다.
        [입출력 예]
        strings	n	                    return
        ["sun", "bed", "car"]	    1	["car", "bed", "sun"]
        ["abce", "abcd", "cdx"]	    2	["abcd", "abce", "cdx"]     */

import java.util.Arrays;

public class ArrayString {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];

        for (int i = 0; i < strings.length; i++) {
            answer[i] = strings[i].charAt(n)+strings[i];
        }
        Arrays.sort(answer);

        for (int i = 0; i < answer.length; i++) {
            answer[i] = answer[i].substring(1);
        }
        return answer;
    }
}


    /*public static void main(String[] args) {
        ArrayString arrayString = new ArrayString();

        String[] n = {"sun", "bed", "car"};
        int m = 1;

        int[] answers = {1, 2, 3, 4, 5, 2, 3, 4, 5, 5};
        String[] solution = arrayString.solution(n, m);

        for (int i = 0; i < solution.length; i++) {
            System.out.print(solution[i] + " ");
        }
    }*/