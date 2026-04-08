//package algos;
//import java.util.ArrayList;
//import java.util.Arrays;
//
//import static java.lang.Long.MAX_VALUE;
//
//class Edge {
//    int node;
//    int weight;
//
//    Edge(int node,int weight){
//        this.node=node;
//        this.weight=weight;
//    }
//}
//class DijkstraAlgorithm{
//
//    public static void main(String[] args){
//        int n=6;
//        ArrayList<ArrayList<Edge>> adjList=new ArrayList<>();
//        for (int i=0; i<n; i++){
//            adjList.add(new ArrayList<>());
//        }
//        adjList.get(0).add(new Edge(1,4));
//        adjList.get(1).add(new Edge(0,4));
//        adjList.get(0).add(new Edge(0,4));
//        adjList.get(2).add(new Edge(2,2));
//        adjList.get(1).add(new Edge(1,2));
//        adjList.get(2).add(new Edge(1,4));
//        adjList.get(2).add(new Edge(3,3));
//        adjList.get(3).add(new Edge(2,3));
//        adjList.get(2).add(new Edge(2,4));
//        adjList.get(4).add(new Edge(1,4));
//        adjList.get(2).add(new Edge(2,4));
//        adjList.get(5).add(new Edge(2,4));
//
//        int[] dist = new int[n];
//        boolean[] visited = new boolean[n];
//
//        Arrays.fill(dist, Integer.MAX_VALUE);
//
//        for (int i=0; i<n; i++){
//            int temp = -1;
//            int min = Integer.MAX_VALUE;
//            for (int j=0; j<n;j++){
//                if(!visited[j] && dist[j] < min){
//                    min = dist[j];
//                    temp = j;
//                }
//            }
//        }
//
//    }
//
//}