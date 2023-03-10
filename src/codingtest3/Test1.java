package codingtest3;

import java.util.Arrays;
//구명보트
class Solution{
    public int solution(int[] people, int limit){
        //people : 몸무게 목록
        //limit : 보트 제한 중량
        int answer = 0; //보트의 이동 횟수
        
        //가장 가벼운 몸무게 저장할 변수(first)
        int first = 0;
        
        
        //가장 무거운 몸무게 저장할 변수(last)
        int last = people.length - 1;
        
        //정렬 (sort() => 오름차순 정렬 => 작은것부터
        //50, 50, 70, 80
        //50, 50, 70, 30
        Arrays.sort(people);
        
        //가벼운 몸무게에서 가장 큰 몸무게의 합이 limit범위에 들어가는지 체크하고
        //limit보다 작으면 first를 증가하면서
        //크면 last를 감소하면서 비교
        while (first <= last){
            answer++;
            if(people[first]+people[last]<=limit){
                answer++;
                first++;
                last--;
            } else {
                last--;
            }
        }

        return answer;
    }
}

public class Test1 {
    public static void main(String[] args){

    }
}
