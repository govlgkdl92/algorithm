package org.success;

import java.util.Arrays;

/*      모의고사
        수포자는 수학을 포기한 사람의 준말입니다.
        수포자 삼인방은 모의고사에 수학 문제를 전부 찍으려 합니다.
        수포자는 1번 문제부터 마지막 문제까지 다음과 같이 찍습니다.

        1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
        2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
        3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...

        1번 문제부터 마지막 문제까지의 정답이 순서대로 들은 배열 answers가 주어졌을 때,
        가장 많은 문제를 맞힌 사람이 누구인지 배열에 담아 return 하도록 solution 함수를 작성해주세요.

        제한 조건 /  시험은 최대 10,000 문제로 구성되어있습니다. 문제의 정답은 1, 2, 3, 4, 5중 하나입니다.
                   가장 높은 점수를 받은 사람이 여럿일 경우, return하는 값을 오름차순 정렬해주세요.
        answers	    return
        [1,2,3,4,5]	[1]
        [1,3,2,4,2]	[1,2,3]     */
public class MockTest {
    public int[] solution(int[] answers) {
        int[] patternA = {1, 2, 3, 4, 5};
        int[] patternB = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] patternC = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int count0 = 0, count1 = 0, count2=0;

        count0 = roof(patternA, answers);
        count1 = roof(patternB, answers);
        count2 = roof(patternC, answers);

/*       System.out.println("countA: "+countA);
        System.out.println("countB: "+countB);
        System.out.println("countC: "+countC);*/

        int[] answer = {};

        answer = new int[1];
        answer[0] = count0 > count1 && count0 > count2 ? 1:
                count1 > count2 && count1 > count0 ? 2 :
                        count2 > count0 && count2 > count0 ? 3 : 0;

        if(count0 == count1){
            if(count2 > count0){
                answer = new int[1];
                answer[0] = 3;
            }else {
                answer = new int[2];
                answer[0] = 1;
                answer[1] = 2;
            }
        }

        if(count0 == count2){
            if(count1 > count0){
                answer = new int[1];
                answer[0] = 2;
            }else {
                answer = new int[2];
                answer[0] = 1;
                answer[1] = 3;
            }
        }

        if(count1 == count2){
            if(count0 > count1){
                answer = new int[1];
                answer[0] = 1;
            }else {
                answer = new int[2];
                answer[0] = 2;
                answer[1] = 3;
            }
        }

        if(count0==count1 && count0==count2){
            answer = new int[3];
            for (int i = 0; i < answer.length; i++) {
                answer[i] = i+1;
            }
        }


        return answer;
    }

    public int roof(int[] pattern, int[] answers){
        int count = 0;
        int answer=0;

        for (int i = 0; i <answers.length; i++) {
            count = pattern[answer]==answers[i] ? ++count : count;
            //System.out.println(patternA[pattern] + " : "+ answers[i]);

            answer++;
            answer = answer==(pattern.length) ? 0 : answer;
        }


        return count;
    }

    /*

    public static void main(String[] args) {
        MockTest mockTest = new MockTest();
       // 1, 2, 3, 4, 5, 2, 3, 4, 5, 5
        int[] answers = {1, 2, 3, 4, 5, 2, 3, 4, 5, 5};
        int[] solution = mockTest.solution(answers);

        for (int i = 0; i < solution.length; i++) {
            System.out.print(solution[i] + " ");
        }
    }

    */

}


