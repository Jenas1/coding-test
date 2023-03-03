package programmers.level1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class GetReportResults {

    public static void main(String[] args) {
        String[] id_list = new String[]{"muzi", "frodo", "apeach", "neo"};
        String[] report = new String[]{"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
        int k = 2;

        int[] solution = solution(id_list, report, k);

        for (int i : solution) {
            System.out.print(i + " ");
        }
    }


    public static int[] solution(String[] id_list, String[] report, int k) {
        Map<String, HashSet<String>> map = new HashMap<>();
        Map<String, Integer> mail = new HashMap<>();
        for (String s : id_list) {
            mail.put(s, 0);
            map.put(s, new HashSet<>());
        }

        for (String re : report) {
            String[] check = re.split(" ");
            map.get(check[1]).add(check[0]);

        }

        for (String key : map.keySet()) {
            HashSet<String> re = map.get(key);
            if (re.size() >= k) {
                for (String reporter : re) {
                    Integer getMail = mail.get(reporter);
                    mail.put(reporter, getMail + 1);
                }
            }
        }

        int[] answer = new int[id_list.length];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = mail.get(id_list[i]);
        }
        return answer;
    }
}
