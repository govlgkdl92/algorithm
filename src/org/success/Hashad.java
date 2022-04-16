package org.success;
/*
하샤드 수
문제 설명
양의 정수 x가 하샤드 수이려면 x의 자릿수의 합으로 x가 나누어져야 합니다.
예를 들어 18의 자릿수 합은 1+8=9이고, 18은 9로 나누어 떨어지므로 18은 하샤드 수입니다.
자연수 x를 입력받아 x가 하샤드 수인지 아닌지 검사하는 함수, solution을 완성해주세요.

[제한 조건]
x는 1 이상, 10000 이하인 정수입니다.
ex) arr	return
    10	true
    12	true
    11	false
    13	false
 */
public class Hashad {
    public static boolean solution(int x) {
        boolean answer = false;

        String str[] = String.valueOf(x).split("");
        int sum = 0;

        for (int i = 0; i < str.length; i++) {
            int a = Integer.parseInt(str[i]);
            sum = sum + a;
        }
        if(x % sum == 0){
            answer = true;
        }
        System.out.println(sum);
        System.out.println(x % sum);
        return answer;
    }


    //main
    public static void main(String[] args) {
        int a = 10;

        boolean solution = solution(1234);
        System.out.println(solution);
    }

}
