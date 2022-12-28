package codingtest3;


//기지국 설치
class Solution2 {
    public int solution(int n, int[] stations, int w) {
        int answer = 0;
        //n : 아파트 동 갯수
        //stations : 기지국이 설치된 위치
        //w : 전파 범위

        //배열로 접근
        //배열에 접근할 수 있는 인덱스 번호
        int index = 0;
        //현재 기지국이 설치된 값을 체크할 변수
        int position = 1;
        //현재 위치에서 아파트 동을 반복하면서
        while(position <= n) {
            //1)기존에 기지국이 설치가 되어 있는 경우 > 전파 범위 체크
            if(index<stations.length && stations[index]-w <= position){
                position = stations[index] + w + 1;
                index++;
                //index = 0; station[0] - w <= position // 4-3
                //index = 1; station[1] - w <= position(4)
                //position = station[1] - w <= position
            }
            //2)새롭게 설치하는 경우
            else {
                answer++;
                position += 2*w+1;
                //position 변경 > 기지국의 위치 2*1+1 > 4
                //position 변경 > 6번일때
            }
        }
        return answer;
    }
}
public class Test2 {
    public static void main(String[] args){

    }
}
