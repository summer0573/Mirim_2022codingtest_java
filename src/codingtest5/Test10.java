package codingtest5;

//정수 삼각형
public class Test10 {
    public int solution(int[][] triangle) {
        int answer = 0;
        //1)별도의 저장 공간을 따로 만들어서 사용 DP테이블
        //계산할 공간을 저장할 배열 생성
        int max = 0;
        int dp[][] = new int[5][5];
        dp[0][0] = triangle[0][0];//첫번째값

        //2)dp테이블의 초기값으로 왼쪽과 오른쪽을 더해서 설정
        //계산은 현재값과 왼쪽(dp[i-1][j], 오른쪽 dp([i-1][j-1])
        for (int i = 1; i < triangle.length; i++) {
            dp[i][0] = dp[i - 1][0] + triangle[i][0];
            dp[i][i] = dp[i - 1][i - 1] + triangle[i][i];
        }
        //세번째줄부터
        for (int i = 2; i < triangle.length; i++) {
            for (int j = 1; j < i; j++) {
                dp[i][j] = Math.max(dp[i - 1][j - 1] + triangle[i][j],
                        dp[i - 1][j] + triangle[i][j]);
            }
        }
        //맨 마지막 줄의 제일 큰 수 찾기
        for(int x : dp[triangle.length-1]){
            if(max < x){
                max = x;
            }
        }

        return max;
    }
}
