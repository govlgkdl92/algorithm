package org.practice;
/* 소수 만들기
주어진 숫자 중 3개의 수를 더했을 때 소수가 되는 경우의 개수를 구하려고 합니다. 숫자들이 들어있는 배열 nums 가 매개변수로 주어질 때,
nums 에 있는 숫자들 중 서로 다른 3개를 골라 더했을 때 소수가 되는 경우의 개수를 return 하도록 solution 함수를 완성해주세요.

제한사항
nums 에 들어있는 숫자의 개수는 3개 이상 50개 이하입니다.
nums 의 각 원소는 1 이상 1,000 이하의 자연수이며, 중복된 숫자가 들어있지 않습니다.

입출력 예
nums	        result
[1,2,3,4]	    1
[1,2,7,6,4]	    4
*/

public class Minority {
    public int solution(int[] nums) {





        int answer = 0;
        int number = 10;
        int arr[] = new int[number+1];

        // 배열 생성
        for(int i=2;i<=number;i++) {
            arr[i] = i;
        }

        // 1은 소수가 아니므로 2부터 시작, 특정 수의 배수에 해당하는 수를 모두 지우기
        for(int i=2;i<=number;i++) {
            if(arr[i]==0) {
                continue; // 이미 지워진 수라면 건너뛰기
            }

            // 이미 지워진 숫자가 아니라면, 그 배수부터 출발하여, 가능한 모든 숫자 지우기
            for(int j=2*i;j<=number; j+=i) {
                arr[j] = 0;
            }
        }

        // 2부터 시작하여 남아있는 수를 모두 출력
        for(int i=2;i<=number;i++) {
            if(arr[i]!=0) {
                answer++;
            }
        }
        return answer;
    }
}
