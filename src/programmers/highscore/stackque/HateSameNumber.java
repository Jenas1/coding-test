package programmers.highscore.stackque;

import java.util.*;

public class HateSameNumber {

    public static void main(String[] args) {

        int[] arr = new int[]{4,4,4,3,3};

        int[] solution = solution(arr);

        for (int i : solution) {
            System.out.printf(" %d", i);
        }

    }

    public static int[] solution(int[] arr) {

        Stack<Integer> stack = new Stack<>();
        List<Integer> list = new ArrayList<>();

        Queue<Integer> queue = new LinkedList<>();

        for (Integer integer : arr) {

            if (stack.empty()) {
                stack.push(integer);

                continue;

            } else if (stack.peek() != integer) {

                stack.push(integer);
                continue;
            }
        }

        while (!stack.empty()) {
            list.add(stack.pop());
        }

        Collections.reverse(list);


        int[] array = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }

        return array;
    }
}
