package codingtest4;


//예산
public class Test5 {
    class Solution {
        public int solution(int w, int[] budget) {
            //budget : 예산신청
            //m : 총 예산
            //최대값
            int max = 0;
            //최소값
            int min = 0;

            for (int b : budget) {
                if (b > max) max = b;
            }
            //혹은
            //Arrays.sort(budget);
            //max = budget[budget.length-1] //배열 길이 -1 까지


            //최대값과 최소값 비교 (이진탐색)

            //중앙값 구하기

            //합계 구하기

            int answer = 0;
            return answer;
        }
    }
}
