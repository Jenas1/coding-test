package ECT.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RoyalKnight {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String coordinate = br.readLine();

        int[][] dir = {{-2, 1}, {-2, -1}, {2, 1}, {2, -1}, {-1, -2}, {-1, 2}, {1, -2}, {1, 2}};
        int count = 0;

        int row = coordinate.charAt(1) - '1';
        int col = coordinate.charAt(0) - 'a';

        for (int i = 0; i < 8; i++) {
            int nr = row + dir[i][0];
            int nc = col + dir[i][1];

            if (nr < 0 || nr > 7 || nc < 0 || nc > 7) continue;
            count++;
        }

        System.out.println(count);

    }
}
