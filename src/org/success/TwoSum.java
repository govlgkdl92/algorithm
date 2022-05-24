package org.success;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*      두 개 뽑아서 더하기
        정수 배열 numbers 가 주어집니다. numbers 에서 서로 다른 인덱스에 있는 두 개의 수를 뽑아 더해서
        만들 수 있는 모든 수를 배열에 오름차순으로 담아 return 하도록 solution 함수를 완성해주세요.

        numbers 의 길이는 2 이상 100 이하입니다.
        numbers 의 모든 수는 0 이상 100 이하입니다.

        numbers	        result
        [2,1,3,4,1]	    [2,3,4,5,6,7]
        [5,0,2,7]	    [2,5,7,9,12]*/
public class TwoSum {
    public int[] solution(int[] numbers) {
        //실패
        List list = new ArrayList();

        for (int i = 1; i< numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                list.add(numbers[i-1]+numbers[j]);
                System.out.println(numbers[i-1]+numbers[j]);
            }
        }
        list = (List<Integer>) list.stream().distinct().collect(Collectors.toList());

         int[] result = new int[list.size()];

         result = list.stream().mapToInt(i-> (int) i).toArray();
         Arrays.sort(result);

        return result;
    }

}
