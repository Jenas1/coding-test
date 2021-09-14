/*
package com.simso.baekjoon.BFS;

import com.simso.ex.Pair;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class BFSTest2 {

    static int[][] board = {{1,1,1,0,1,0,0,0,0,0},
            {1,0,0,0,1,0,0,0,0,0},
            {1,1,1,0,1,0,0,0,0,0},
            {1,1,0,0,1,0,0,0,0,0},
            {0,1,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0} };

    static boolean[][] visited = new boolean[9][9];

    static int n = 7;
    static int m = 10;
    static int[] dx = {1,0,-1,0};
    static int[] dy = {0,1,0,-1};
    public static void main(String[] args) {

    }

    public static Integer  test(){
        int[] pair = new int[2];


        Queue<pair> Q = new LinkedList<>();
        visited[0][0] = true;



        Q.offer(pair);



        while (!Q.isEmpty()){
            Pair cur = new Pair();



            for (int dir = 0; dir < 4; dir++) {
                int nx = cur.getX() + dx[dir];
                int ny = cur.getY() + dy[dir];

                if(nx <=0 || nx >= n || ny<0 || ny >= m) continue;

                if(visited[nx][ny] || board[nx][ny] !=1) continue;
                visited[nx][ny] = true;

                Pair pair1 = new Pair(nx ,ny);
                Q.add(pair1);

            }


        }

        return pair.getX();
    }


}
*/
