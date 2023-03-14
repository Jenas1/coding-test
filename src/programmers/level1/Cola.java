package programmers.level1;

public class Cola {
    public static void main(String[] args) {

        System.out.println(solution(3,1,20));
    }


    public static int solution(int a, int b, int n) {
        int count = 0;
        int num = 0;
        while(n >= a) {

            num = n / a * b;
            count += num;
            n = n % a + num;

            //count += b;
            //n = n - a + b;
        }
        return count;
    }
}
