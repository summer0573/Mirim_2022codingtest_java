package codingtest2;

import java.util.Arrays;
import java.util.List;

public class FilterExample {
    public static void main(String[] args){
        List<String> names = Arrays.asList("정현진", "김꽊곽", "이어쩔", "박뽕뽕");

        names.stream()//오리지널 스트림 변환
                .distinct() //중간처리 > 중복 제거
                .forEach(n->System.out.println(n)); //최종 처리

        System.out.println("=============================");

        names.stream()
                .filter(n->n.startsWith("신")) //중간처리
                .forEach(n-> System.out.println(n));

        //중복 제거 + 필터


    }
}
