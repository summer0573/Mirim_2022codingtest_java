package codingtest5;

import java.util.Arrays;
import java.util.HashMap;

//전화번호 목록
public class Test8 {
    public boolean solution(String[] phone_book) {

        boolean answer = true;

        //방법1>정렬 후 비교
        //정렬
//        Arrays.sort(phone_book);
//
//        for (int i = 0; i < phone_book.length - 1; i++) {
//            if (phone_book[i + 1].startsWith(phone_book[i])) {
//                answer = false;
//            }
//        }

        //방법2>HashMap을 이용한 코드로 변경
        //1) Map 만들기 : 전화번호값(key), value : 전화번호의 인덱스
        HashMap<String, Integer> map = new HashMap<>();

        //2) Map에 값 넣기
        for(int i = 0; i<phone_book.length; i++){
            map.put(phone_book[i], 1);
        }

        //3) 전화번호의 값이 map에 존재하는지 확인
        for (int i = 0; i<phone_book.length; i++){
            for (int j = 0; j<phone_book[i].length(); j++){
                if(map.containsKey(phone_book[i].substring(0,j))){
                    answer = false;
                }
            }
        }
        return answer;
    }
}
