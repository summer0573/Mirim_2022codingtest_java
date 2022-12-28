package codingtest3;

import java.util.Arrays;
import java.util.Comparator;

//가장 큰 수
class Solution4 {
    public String solution(int[] numbers) {
        String answer = "";

        String[] strNums = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            strNums[i] = "" + numbers[i];
            //ex)"6", "10", "2"
        }

        //1)버블 정렬
//        for (int i = 0; i < strNums.length - 1; i++) {
//            for (int j = i + 1; j < strNums.length; j++) {
//                String s1 = strNums[i];
//                String s2 = strNums[j];
//                if ((s1 + s2).compareTo(s2 + s1) < 0) {
//                    strNums[i] = strNums[j];
//                    strNums[j] = s1;
//                }
//            }
//        }

        //2)sort
        Arrays.sort(strNums, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return (s2+s1).compareTo(s1+s2);
            }
        });

        //3)람다식

        //numbers : 숫자 > 문자로 변환 > 내림차순 정렬
        //문자열 다루는 배열의 주어진 numbers을 문자로 저장

        //정렬
        //문자열 비교 -> 첫번째 문자 + 두번째 문자 -> 숫자 문자열
        //->    -> 첫번째 문자 + 세번째 문자 > 숫자 문자열
        //1) x.compareTo(y)
        //2) x==y : 0
        //3) x>y : 양수 -> 만약 내림차순 정렬이라면 x값이 크므로 자리를 바꾸지 않아도 됨
        //4) x<y : 음수 -> 자릴 바꿔줌


        //0이 들어왔을 때 값을 문자열 0으로
        for (String s : strNums) {
            answer += s;
        }

        if (answer.charAt(0)=='0') return "0";


        //출력
        return answer;
    }
}

public class Test4 {
    public static void main(String[] args) {

    }
}
