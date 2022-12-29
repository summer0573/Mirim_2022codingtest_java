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
                sum += mid / times[i];
            }
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
}
