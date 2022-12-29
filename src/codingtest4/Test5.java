package codingtest4;


import java.util.Arrays;
import java.util.stream.IntStream;

//예산
public class Test5 {
    class Solution {
        public int solution(int m, int[] budget) {
            int answer = 0;
            //budget : 예산신청
            //m : 총 예산
            //최대값
            int max = IntStream.of(budget).max().orElse(0);
            //최소값
            int min = 0;
            int sum=0;
//            //최대값과 최소값 비교(이진 탐색
//            while(min <= max){
//                int mid = (min + max)/2; //중앙값 구하기
//                int sum = IntStream.of(budget)
//                        .map(b->Math.min(b, mid))
//                        .sum();
//                //총합계 금액과 총예산 비교
//                if(sum <= m){
//
//                }
//
//            }

            for (int b : budget) {
                if (b > max) max = b;
            }
            //혹은
            //Arrays.sort(budget);
            //max = budget[budget.length-1] //배열 길이 -1 까지

            //최대값과 최소값 비교 (이진탐색)
            while (min <= max){
                int mid = (min + max)/2; //중앙값 구하기
                for(int b : budget){
                    if(b > mid){
                        sum += mid; //신청한 예산이 상한액보다 큰 경우
                    } else {
                        sum += b; //신청한 값으로
                    }
                }
                //총합계 금액과 총예산 비교
                if(sum <= m){
                    min = mid+1; //최소값을 새 조정
                    answer = mid;
                } else {
                    max = mid -1;
                }
            }



            return answer;
        }
    }
}
