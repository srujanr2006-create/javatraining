package graph;

import java.util.ArrayList;

public class graph1 {
    //adjacency list
    ArrayList<ArrayList<Integer>> adjList;

    graph1(int n){
        adjList = new ArrayList<>();
        for (int i=0; i<n; i++){
            adjList.add(new ArrayList<>());
        }
    }
    void addEdge(int u, int v){
        adjList.get(u).add(v);
        adjList.get(v).add(u);
    }
    void printAdjList(){
        for (int i=0; i<adjList.size(); i++){
            System.out.print(i + "->");
            for (int j:adjList.get(i)){
                System.out.print(j + ", ");
            }
            System.out.println();
        }
    }
}

class DriverCode{
    public static void main(String[] args) {
        graph1 g = new graph1(6);
        g.addEdge(0,1);
        g.addEdge(0,4);
        g.addEdge(0,5);
        g.addEdge(1,2);
        g.addEdge(1,4);
        g.addEdge(1,3);
        g.addEdge(2,3);
        g.addEdge(3,4);
        g.addEdge(4,5);

        g.printAdjList();
    }
}