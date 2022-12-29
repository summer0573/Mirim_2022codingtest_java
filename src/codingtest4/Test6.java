package codingtest4;


import java.util.Arrays;

//입국심사
public class Test6 {
    public long solution(int n, int[] times) {
        long answer = 0;
        //times ; 심사시간 걸리는 시간
        //n : 입국자들
        //배열 sort
        Arrays.sort(times);
        long left = 1; //최소 걸리는 시간
        long right = (long) times[times.length - 1] * n; //최대 걸리는 시간

        // 최대와 최소 비교
        while (left <= right) {
            //중간값
            long mid = (left + right) / 2;
            long sum = 0;
            for (int i = 0; i < times.length; i++) {
                sum += mid / times[i]; //mid값에 심사하는 시간을 나누어서 sum에 저장
            }
            //ex)times : 7, 10, n = 6
            //left : i,right : 10*6 -> 60, mid = 61/2 -> 30.5
            //sum -> 30.5/7 -> 4, 30.5/10 -> 3 -> 7 -> mid 시간동안 몇명이 심사했는지
            //mid로 정해놓은 시간내에 n이 모두 심사를 받을 수 있는가를 체크

            if (sum < n) {
                left = mid + 1;
            } else {
                right = mid - 1;
                answer = mid;
            }
        }

        return answer;
    }
}
