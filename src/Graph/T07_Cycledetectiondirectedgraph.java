package src.Graph;
import java.util.*;
public class T07_Cycledetectiondirectedgraph {
    class Edge{
        int src;
        int dest;
        Edge(int s , int d){
            this.src= s;
            this.dest= d;
        }
    }
    public void createGraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i] = new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0,2));
        graph[1].add(new Edge(1,0));
        graph[2].add(new Edge(2,3));
        graph[3].add(new Edge(3,0));
    }


    public static void main(String[] args) {
        int v=4;
        ArrayList<Edge> graph[] = new ArrayList[v];
        T07_Cycledetectiondirectedgraph obj = new T07_Cycledetectiondirectedgraph();
        obj.createGraph(graph);
    }
}
