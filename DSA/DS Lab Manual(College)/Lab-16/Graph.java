/*
 * 85. Write a program to create a graph & implement the adjacency list representation of the graph 
 Apply DFS and BFS on the given graph.
86. Write a program to apply DFS & BFS for a graph.
 */

import java.util.*;

class Graph {
    public Map<Integer, List<Integer>> adjList;

    public Graph() {
        adjList = new HashMap<>();
    }

    public void addEdge(int u, int v) {
        adjList.putIfAbsent(u, new ArrayList<>());
        adjList.putIfAbsent(v, new ArrayList<>());
        adjList.get(u).add(v);
        adjList.get(v).add(u); // For undirected graph
    }

    public void dfs(int start) {
        Set<Integer> visited = new HashSet<>();
        dfsHelper(start, visited);
    }

    public void dfsHelper(int vertex, Set<Integer> visited) {
        visited.add(vertex);
        System.out.print(vertex + " ");
        for (int neighbour : adjList.getOrDefault(vertex, new ArrayList<>())) {
            if (!visited.contains(neighbour)) {
                dfsHelper(neighbour, visited);
            }
        }
    }

    public void bfs(int start) {
        Set<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();
        visited.add(start);
        queue.add(start);

        while (!queue.isEmpty()) {
            int vertex = queue.poll();
            System.out.print(vertex + " ");
            for (int neighbour : adjList.getOrDefault(vertex, new ArrayList<>())) {
                if (!visited.contains(neighbour)) {
                    visited.add(neighbour);
                    queue.add(neighbour);
                }
            }
        }
    }                      

    public static void main(String[] args) {
        Graph g = new Graph();
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(1, 3);
        g.addEdge(2, 4);
        g.addEdge(3, 4);

        System.out.println("DFS starting from vertex 0:");
        g.dfs(1);

        System.out.println("\nBFS starting from vertex 0:");
        g.bfs(1);
    }
}
