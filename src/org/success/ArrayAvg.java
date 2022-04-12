package org.success;
/*정수를 담고 있는 배열 arr의 평균값을 return하는 함수, solution을 완성해보세요.

        제한사항
        arr은 길이 1 이상, 100 이하인 배열입니다.
        arr의 원소는 -10,000 이상 10,000 이하인 정수입니다.
        입출력 예
        arr	return
        [1,2,3,4]	2.5
        [5,5]	5*/
public class ArrayAvg {


        public static double solution(int[] arr) {
            int total = 0;

            for (int i = 0; i < arr.length; i++) {
                int sum = arr[i];
                total = total+sum;
            }

            double answer= (double)total/arr.length;

            return answer;
        }


        //main
        public static void main(String[] args) {
            int[] a = {2,3,4,5,22};
            double solution = solution(a);
            System.out.println(solution);
        }


}
