package programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Card {

    public static void main(String[] args) {
        String[] cards1 = {"i", "drink", "water"};
        String[] cards2 = {"want", "to"};
        String[] goal = {"i", "want", "to", "drink", "water"};

        String result = solution(cards1, cards2, goal);

        System.out.println(result);
    }


    public static String solution(String[] cards1, String[] cards2, String[] goal) {
        //String answer = "";

        List<String> cardsArray1 = new ArrayList<>(Arrays.asList(cards1));
        List<String> cardsArray2 = new ArrayList<>(Arrays.asList(cards2));

        for (String s : goal) {

            if (s.equals(cardsArray1.get(0))) {
                cardsArray1.remove(0);
                continue;

            } else if (s.equals(cardsArray2.get(0))) {
                cardsArray2.remove(0);
                continue;

            } else {
                return "No";
            }

        }

        return "Yes";
    }
}
