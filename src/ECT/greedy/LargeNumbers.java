package ECT.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class LargeNumbers {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st =  new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];

        StringTokenizer st1 =  new StringTokenizer(br.readLine());


        for (int i = 0; i < N; i++) {
           arr[i] = Integer.parseInt(st1.nextToken());
        }

        Arrays.sort(arr);

        int max = arr[arr.length -1];
        int nextMax = arr[arr.length -2];

        int sum = 0;
        int count = K;
        for (int i = 0; i < M; i++) {


            if(count == 0){
                sum += nextMax;
                count = K;
            }else {
                sum += max;
                count -= 1;
            }
        }

        System.out.println(sum);

    }
}
