package codingtest5;

//올바른 괄호의 갯수
public class Test11 {
    int answer = 0;

    public int solution(int n) {
        dfs(0, 0, n);
        return answer;

    }

    public void dfs(int open, int close, int n) {
        if (open > n || close > n || close > open) {
            return;
        }

        if (open == n && close == n) {
            answer++;
            return;
        }
        dfs(open + 1, close, n);
        dfs(open, close + 1, n);
    }
}
