package codingtest3;


import java.util.Arrays;

//k번째수
import java.util.Arrays;

class Solution3 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        //commansd[index][0] : 시작
        //commansd[index][1] : 끝
        //commansd[index][2] : 순위에 해당하는 값

        //1>값을 뽑아내고
        for(int i = 0; i < commands.length; i++){
            int start = commands[i][0]-1;
            int end = commands[i][1];
            int k = commands[i][2];

//            int[] tmp = new int[end - start + 1];
//            int a = 0;
//            for(int j = start-1; j < end; j++){
//                tmp[a++] = array[j];
//            }
            int[] tmp = Arrays.copyOfRange(array, start, end);

            //Array > copyofRange(배열, 시작, 끝)

            //2>정렬
            Arrays.sort(tmp);

            // 3>원하는 값 찾기
            answer[i] = tmp[k-1];
        }

        return answer;
    }
}

public class Test3 {
    public static void main(String[] args){

    }
}
