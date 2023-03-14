package programmers.level1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class FailureRate {

    public static void main(String[] args) {

        int[] stages = new int[]{2, 1, 2, 6, 2, 4, 3, 3};
        int[] result = solution(5, stages);


        for (int i : result) {
            System.out.print(i);
        }
    }


    public static int[] solution(int N, int[] stages) {
        List<Integer> list = new ArrayList<>();
        HashMap<Integer, Float> map = new HashMap<>();

        int clear = stages.length;

        for (int i = 1; i <= N + 1; i++) {
            map.put(i, 0f);
        }

        for (int stage : stages) {
            float tmp = map.get(stage) + 1;
            map.replace(stage, tmp);
        }

        for (int i = 1; i <= N; i++) {
            float tmp = map.get(i);

            if (clear != 0) {
                map.replace(i, tmp / clear);
            }

            list.add(i);
            clear -= tmp;
        }

        list.sort((f1, f2) -> {
            Float v1 = map.get(f1);
            Float v2 = map.get(f2);
            return v2.compareTo(v1);
        });

        return list
                .stream()
                .mapToInt(i -> i)
                .toArray();
    }
}