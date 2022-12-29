package codingtest4;


import java.util.*;

//완주하지 못한 선수
public class Test7 {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        /*
        int i = 0;
        Arrays.sort(participant);
        Arrays.sort(completion);
        for (i = 0; i < completion.length; i++) {
            if (!participant[i].equals(completion[i])) break;
        }
        return participant[i];
        */

        //방법 2
        //1) hashmap 만들기 (String, Integer)
        HashMap<String, Integer> map = new HashMap<>();
        //2) hashmap 키와 값 삽입
        //참여자 목록
        for (String player : participant) {
            map.put(player, map.getOrDefault(player, 0) + 1);
        }
        //완주자 목록
        for (String player : completion) {
            map.put(player, map.get(player) - 1);
        }

        //3)반복자를 이용해서 키에 해당하는 값 얻어오기
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            if (entry.getValue() != 0) {
                answer = entry.getKey();
                break;
            }
        }
        return answer;
    }
}
