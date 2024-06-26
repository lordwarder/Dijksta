
/**
 * Finds the shortest path between a starting and ending node.
 *
 * @author Jack
 * @version 16/06/2024
 */
public class Dijkstra
{
    private int[] dist;
    
    public Dijkstra(Graph g, Node source) {
        dist = new int[g.nodes.len()];
    }
    /*
 1  function Dijkstra(Graph, source):
 2     
 3      for each vertex v in Graph.Vertices:
 4          dist[v] ← INFINITY
 5          prev[v] ← UNDEFINED
 6          add v to Q
 7      dist[source] ← 0
 8     
 9      while Q is not empty:
10          u ← vertex in Q with minimum dist[u]
11          remove u from Q
12         
13          for each neighbor v of u still in Q:
14              alt ← dist[u] + Graph.Edges(u, v)
15              if alt < dist[v]:
16                  dist[v] ← alt
17                  prev[v] ← u
18
19      return dist[], prev[]
     */
}
