package org.success;
/*      두 수를 입력받아 두 수의 최대공약수와 최소공배수를 반환하는 함수, solution을 완성해 보세요.
        배열의 맨 앞에 최대공약수, 그다음 최소공배수를 넣어 반환하면 됩니다.
        예를 들어 두 수 3, 12의 최대공약수는 3, 최소공배수는 12이므로 solution(3, 12)는 [3, 12]를 반환해야 합니다.*/

public class Susu {
    public static int[] solution(int n, int m) {
        int[] answer = new int[2];

        int mul = n * m;
        int min = 0;//(n>=m) ? n % m : m % n;

        while(true){
         min = (n>=m) ? n % m : m % n;

         if(min == 0) {
             break;
         }
         n = (n>=m) ? m : n;
         m = min;

         if(n == 1 || m==1){
             break;
         }
        }
        answer[0] = (n>=m) ? m : n;

        answer[1] = mul/answer[0];

        return answer;
    }


// a * b / 최대공약수

    //main
    public static void main(String[] args) {
        int n = 3;
        int m = 12;
        int[] solution = solution(n, m);
        System.out.println(solution[0]+","+solution[1]);

    }
}



   /* public static int[] solution(int n, int m) {
        int[] answer = new int[2];

        int mul = n * m;
        int min = (n>=m) ? n % m : m % n;

        while(true){
            if(min == 0) {
                break;
            }
            n = (n>=m) ? m : n;
            m = min;

            if(n == 1 || m==1){
                break;
            }
        }
        answer[0] = (n>=m) ? m : n;

        answer[1] = mul/answer[0];

        return answer;
    }*/