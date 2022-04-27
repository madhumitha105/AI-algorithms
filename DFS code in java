import java.io.*;
import java.util.*;
class Main
{
private int V;
private LinkedList < Integer > adj[];
Main(int v)
 {
V = v;
adj = new LinkedList[v];
for (int i = 0; i < v; ++i)
adj[i] = new LinkedList ();
}
void addEdge (int v, int w)
  {
adj[v].add (w);
  }
  void DFSUtil (int v, boolean visited[])
  {
visited[v] = true;
System.out.print (v + " ");
Iterator < Integer > i = adj[v].listIterator ();
while (i.hasNext ())
      {
int n = i.next ();
if (!visited[n])
DFSUtil (n, visited);
}
}
void DFS () {
boolean visited[] = new boolean[V];
for (int i = 0; i < V; ++i)
if (visited[i] == false)
DFSUtil (i, visited);
}
public static void main (String args[])
{
Main g = new Main(15);
g.addEdge (10, 1);
g.addEdge (0, 2);
g.addEdge (10, 2);
g.addEdge (2, 10);
g.addEdge (12, 3);
g.addEdge (3, 13);
System.out.println ("Following is Depth First Traversal");
g.DFS ();
}
}

