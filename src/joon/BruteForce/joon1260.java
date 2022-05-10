package joon.BruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/1260
// title : DFS와 BFS
// time : 1h
// Creat by haerin on 2022/05/09

public class joon1260 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int start_location = Integer.parseInt(st.nextToken());

        int[][] table = new int[N+1][N+1];

        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine(), " ");
            int node1 = Integer.parseInt(st.nextToken());
            int node2 = Integer.parseInt(st.nextToken());
            table[node1][node2] = 1;
            table[node2][node1] = 1;
        }

        
        int[] isVisited = new int[N+1];
        ArrayList<Integer> nodeList = new ArrayList<>();

        dfs(table,isVisited,start_location,nodeList);
        printList(nodeList); 

        isVisited = new int[N+1];
        bfs(table,isVisited,start_location);
    }

    public static void printList(ArrayList<Integer> List){

        for(int i=0; i<List.size(); i++){
            System.out.print(List.get(i));
            if(i < List.size()-1)
                System.out.print(" ");
            else
                System.out.println();
        }
    }

    public static void dfs(int[][] table, int[] isVisited, int start_location, ArrayList<Integer> nodeList){

        isVisited[start_location] = 1;
        nodeList.add(start_location);

        for(int i=1; i<table.length; i++){
            if(table[start_location][i] == 1 && isVisited[i] == 0){
                dfs(table,isVisited,i,nodeList);
            }
        }
    }

    public static void bfs(int[][] table, int[] isVisited, int start_location){

        Queue<Integer> queue = new LinkedList<>();

        queue.offer(start_location);
        isVisited[start_location] = 1;

        while(!queue.isEmpty()){
            int tmp = queue.remove();
            System.out.print(tmp + " ");

            for(int i=1; i<table.length; i++){
                if(table[tmp][i] == 1 && isVisited[i] == 0){
                    isVisited[i] = 1;
                    queue.offer(i);
                }
            }
        }

        
    }
}
