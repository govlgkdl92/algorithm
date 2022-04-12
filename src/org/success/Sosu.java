package org.success;

import java.util.Arrays;
import java.util.Collections;

/*      소수찾기
        1부터 입력받은 숫자 n 사이에 있는 소수의 개수를 반환하는 함수, solution을 만들어 보세요.

        소수는 1과 자기 자신으로만 나누어지는 수를 의미합니다.
        (1은 소수가 아닙니다.)

        제한 조건
        n은 2이상 1000000이하의 자연수입니다.
        입출력 예
        n	result
        10	4
        5	3*/
public class Sosu {
    public static int solution(int n) {
        int answer = 0;
        int number = n;
        int arr[] = new int[number+1];

        // 1. 배열을 생성하여 초기화한다.
        for(int i=2;i<=number;i++) {
            arr[i] = i;
        }

        // 2. 2부터 시작해서 특정 수의 배수에 해당하는 수를 모두 지운다.
        // (지울 때 자기자신은 지우지 않고, 이미 지워진 수는 건너뛴다.)
        for(int i=2;i<=number;i++) {
            if(arr[i]==0) continue; // 이미 지워진 수라면 건너뛰기

            // 이미 지워진 숫자가 아니라면, 그 배수부터 출발하여, 가능한 모든 숫자 지우기
            for(int j=2*i;j<=number; j+=i) {
                arr[j] = 0;
            }
        }

        // 3. 2부터 시작하여 남아있는 수를 모두 출력한다.
        for(int i=2;i<=number;i++) {
            if(arr[i]!=0) {
                answer++;
            }
        }

        return answer;
    }



    //main
    public static void main(String[] args) {
        int a = 5;
        int solution = solution(a);
        System.out.println(solution);
    }
}
