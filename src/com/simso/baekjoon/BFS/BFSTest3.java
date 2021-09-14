package com.simso.baekjoon.BFS;

import com.simso.ex.Pair;

import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BFSTest3 {


    static int [][]board;
    static boolean[][] vis;
    static int n;
    static int m;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        board = new int[n][m];
        vis = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(bf.readLine());
            for (int j = 0; j < m; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        System.out.println("++=++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        int mx = 0;
        int num = 0;

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {
                if(board[i][j] == 0 || vis[i][j]) continue;

                num++;
                Queue<Point> Q = new LinkedList<>();
                vis[i][j] = true;
                Q.offer(new Point(i,j));

                int area = 0;

                while (! Q.isEmpty()){
                    area ++;

                    Point cur = Q.poll();

                    for (int dir  = 0; dir  < 4; dir ++) {
                        int nx = cur.x + dx[dir];
                        int ny = cur.y + dy[dir];

                        if(nx < 0 || nx >= n || ny < 0 || ny >= m) continue;

                        if(vis[nx][ny] || board[nx][ny] != 1) continue;

                        vis[nx][ny] = true;

                        Q.offer(new Point(nx, ny));
                    }

                }
                mx = Math.max(mx, area);
            }

        }
        System.out.println(num);
        System.out.println(mx);

    }
}
