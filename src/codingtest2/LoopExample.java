package codingtest2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class LoopExample {
    public static void main(String[] args){
        int[] intArray = {23,33,11,8,4};
        IntStream intStream = Arrays.stream(intArray);

        intStream.filter(a->a%2==0).peek(n->System.out.println(n)).sum();
        System.out.println("============================");
        IntStream intStream1 = Arrays.stream(intArray);
        intStream1.filter(a->a%2==1).forEach(n->System.out.println(n));

        //매칭
        int[] intArray1 = {2,4,6};
        boolean result = Arrays.stream(intArray1)
                .allMatch(a->a%2==0);
        System.out.println("결과 : "+result);
        result = Arrays.stream(intArray1)
                .anyMatch(a->a%3==0);
        System.out.println("결과 : "+result);

        //최종 결과물의 디폴트값
        List<Integer> list = new ArrayList<>();

        double avg = list.stream()
                .mapToInt(Integer :: intValue)
                .average()
                .orElse(0.0);
        System.out.println("결과 : " + avg);

        list.stream()
                .mapToInt(Integer :: intValue)
                .average()
                .ifPresent(a->System.out.println("평균 : "+a));

    }
}
