package org.success;
/*자연수 뒤집어 배열로 만들기
        문제 설명
        자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.

        제한 조건
        n은 10,000,000,000이하인 자연수입니다.
        입출력 예
        n	return
        12345	[5,4,3,2,1]
*/
public class FlipArray {
    public static int[] solution(long n) {
        String[] number = (String.valueOf(n).split(""));

        int[] answer = new int[number.length];

        int total = (int)(Math.log10(n)+1);
        for (int i = 0; i <= total-1; i++) {
            answer[i] = Integer.parseInt(number[total-(1+i)]);
        }
        return answer;
    }


    //main
    public static void main(String[] args) {
        long a = 12345678;
        int[] solution = solution(a);

        for (int i = 0; i < solution.length; i++) {
            System.out.print(solution[i]+" ");
        }

    }
}
