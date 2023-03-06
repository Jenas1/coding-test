package programmers.base;

import java.util.ArrayList;
import java.util.Collections;

public class sortMain {
    public static void main(String[] args) {
        String[] strings = new String[]{"sun", "bed", "car"};

        int n = 1;

        String[] solution = solution(strings, n);

        for (String s : solution) {

            System.out.print(s + " ");
        }

    }

    public static String[] solution(String[] strings, int n) {

        ArrayList<String> arr = new ArrayList<>();

        for (int i = 0; i < strings.length; i++) {

            arr.add(strings[i].charAt(n) + strings[i]);

        }

        Collections.sort(arr);

        String[] answer = new String[arr.size()];

        for (int i = 0; i < arr.size(); i++) {

            answer[i] = arr.get(i).substring(1);
        }


        return answer;
    }
}
