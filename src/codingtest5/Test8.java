package codingtest5;

import java.util.Arrays;

//전화번호 목록
public class Test8 {
    public boolean solution(String[] phone_book) {
        //방법1>정렬 후 비교
        boolean answer = true;

        //정렬
        Arrays.sort(phone_book);

        for (int i = 0; i < phone_book.length - 1; i++) {
            if (phone_book[i + 1].startsWith(phone_book[i])) {
                answer = false;
            }
        }

        return answer;
    }
}
