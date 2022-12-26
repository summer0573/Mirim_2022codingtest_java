package codingtest1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StudentExample {
    public static void main(String[] args){
        //컬렉션으로 스트림 열기
        List<Student> studentList =
                Arrays.asList(new Student("홍길동", 10),
                        new Student("정현진", 20));

        //반복자(Iterator)
        //스트림(stream)
        Stream<Student> stream = studentList.stream();
        stream.forEach(s -> System.out.println(s.getName()));

        //배열로 스트림
        String[] strArray = {"홍길동", "김미림", "김배화"};
        Stream<String> strStream = Arrays.stream(strArray);
        strStream.forEach(a->System.out.println(a+","));
        System.out.println("-------------------------------------");
        int[] intArray = {1,2,3,4,5};
        IntStream intStream = Arrays.stream(intArray);
        intStream.forEach(a->System.out.println(a*2+","));

        //숫자로 스트림
    }
}
