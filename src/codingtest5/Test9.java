package codingtest5;

import java.util.HashMap;
import java.util.Iterator;

//위장
public class Test9 {
    public int solution(String[][] clothes) {
        int answer = 0;

        HashMap<String, Integer> map = new HashMap<>();

        //2) 배열을 Map테이블로 만들기
        for (String[] c : clothes) {
            String type = c[1];
            map.put(type, map.getOrDefault(type, 0) + 1);
            //getOrDefault(키이름, 해당값)
            //key이라는 키값에 value가 없으면 0으로 셋팅
            //혹시 이전값이 있다면 +1 더함
        }

        //3)모두 조합하기
        Iterator<Integer> it = map.values().iterator();
        //map에 저장된 값들을 참조할 반복자 선언
        while (it.hasNext()) {
            answer *= it.next().intValue() + 1;
            //모든 종류의 옷을 서로 곱해서 경우의 수를 구함
            //3*2 ==> 6-1
        }
        //none(어떤 종류)의 옷도 입지 않은 경우
        return answer - 1;
    }
}
