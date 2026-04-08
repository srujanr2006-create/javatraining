package graph;

public class GRaph {
    int[][] adjMat; // ajacency matrix
    int v; // number of vertices
    GRaph(int vertices){
        this.v = vertices;
        adjMat = new int[v][v];
    }
    void addEdge(int u, int v){
        adjMat[u][v] = 1;
        adjMat[v][u] = 1;
    }
    void printAdjmat(){
        System.out.println("adjcency matrix:" );
        for (int i=0; i<v; i++){
            for(int j=0; j<v; j++){
                System.out.print(adjMat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
class Driver{
    public static void main(String[] args) {
        GRaph g = new GRaph(6);
        g.addEdge(0,1);
        g.addEdge(0,4);
        g.addEdge(0,5);
        g.addEdge(1,2);
        g.addEdge(1,4);
        g.addEdge(1,3);
        g.addEdge(2,3);
        g.addEdge(3,4);
        g.addEdge(4,5);

        g.printAdjmat();
    }
}