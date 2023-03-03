package programmers.highscore.stackque;

import java.util.Arrays;

public class joystick {
    public static void main(String[] args) {

        int[] reserve = new int[]{1, 3, 5};
        int[] lost = new int[]{2, 4};

        solution(5, lost, reserve);

    }

    public static void solution(int n, int[] lost, int[] reserve) {
        int count = 0;

//        Arrays.sort(lost);
//        Arrays.sort(reserve);

        for(int i=0; i < lost.length; i++) {

            for(int j=0; j < reserve.length; j++) {

                if(lost[i] == reserve[j]) {
                    lost[i] = -1;
                    reserve[j] = -1;

                    count++;

                    break;
                }
            }
        }

        for (int i = 0; i < lost.length; i++) {

            for (int j = 0; j < reserve.length; j++) {

                if (lost[i] == reserve[j] + 1 || lost[i] == reserve[j] - 1) {
                    count++;

                    reserve[j] = -1;
                    break;

                }
            }
        }

        int total = n - lost.length + count;

        System.out.println(total);
    }
}