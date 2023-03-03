package programmers.highscore.stackque;

public class joystick2 {
    public static void main(String[] args) {


        solution("JEROEN");

    }

    public static void solution(String name) {

        int nameLength = name.length();

        int upDownMove = 0;
        int leftRightMove = nameLength - 1;

        for (int i = 0; i < name.length(); i++) {

            char c = name.charAt(i);

            int A = c - 'A';
            int B = 'Z' - c + 1;

            // 상하 좌우 비교
            upDownMove += Math.min(A, B);

            // A 갯수
            int next = i + 1;

            while (next < nameLength && name.charAt(next) == 'A') {
                next++;
            }

            // 좌우 비교
            leftRightMove = Math.min(leftRightMove, i * 2 + nameLength - next);
            leftRightMove = Math.min(leftRightMove, (nameLength - next) * 2 + i);
        }

        System.out.println(upDownMove + leftRightMove);
    }
}