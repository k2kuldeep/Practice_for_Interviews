import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class bfs {

    private ArrayList<ArrayList<Integer>> alist = new ArrayList<>();
    private int number_of_vertex;

    bfs(int V){
        number_of_vertex = V;
        for (int i = 0;i<V;i++){
            alist.add(new ArrayList<>());
        }
    }

    public static void main(String[] args) {

        bfs t = new bfs(4);

        t.addEdge(0, 1);
        t.addEdge(0, 2);
        t.addEdge(1, 2);
        t.addEdge(2, 0);
        t.addEdge(2, 3);
        t.addEdge(3, 3);

        //t.printlist();
        t.bfs(2);
    }

    void bfs(int s) {

        boolean[] visited = new boolean[number_of_vertex];

        Queue<Integer> queue = new LinkedList<>();

        queue.add(s);
        visited[s] = true;

        while(!queue.isEmpty()){
            s = queue.poll();
            System.out.print(s+" ");

            // method - 1
            for (Integer vertex : alist.get(s)) {
                if (!visited[vertex]) {
                    queue.add(vertex);
                    visited[vertex] = true;
                }
            }
            /*
            //method - 2
            Iterator it = alist.get(s).iterator();
            while(it.hasNext()){
                    int vertex = (int)it.next();
                    if (!visited[vertex]){
                    queue.add(vertex);
                    visited[vertex] = true;
                    }
                    }
            */
        }

    }

    void addEdge(int u, int v){ alist.get(u).add(v); }

    void printlist(){
        for (int i=0;i<alist.size();i++){
            System.out.println("vertex "+i);
            for (int j=0;j<alist.get(i).size();j++){
                System.out.print(" -> " + alist.get(i).get(j));
            }
            System.out.println();
        }
    }
    
}
