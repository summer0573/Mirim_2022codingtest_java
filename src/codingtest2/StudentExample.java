package codingtest2;

import java.util.Arrays;
import java.util.List;

public class StudentExample {
    public static void main(String[] args){
        List<Student> studentList = Arrays.asList(new Student("정현진", 10),
                                                    new Student("홍길동", 20),
                                                    new Student("김꽉꽉", 30)
                );
        double avg = studentList.stream() //오리지널 스트림
                .mapToInt(Student :: getScore) //중간 처리
                .average() //최종처리
                .getAsDouble();

        System.out.println("평균 : " + avg) ;
    }
}
