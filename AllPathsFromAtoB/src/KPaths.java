import java.util.*;
import java.lang.*;
import java.io.*;

class   KPaths
{
    static final int  V = 6; //Number of  destinationertices
    ArrayList<int[]> correctPaths = new ArrayList<>();

    // A naive recursive function to count walks from source
    // to  destination with   depth edges
    int countwalks(int graph[][], int source, int  destination, int   depth, int[] currentPath)
    {
        int[] path = new int[currentPath.length];
        System.arraycopy(currentPath, 0, path,0, currentPath.length - depth -1);
        path[path.length - depth -1] = source;

        // Base cases
        if (depth == 0 && source ==  destination){System.out.println(Arrays.toString(path));return 1;}
        if (depth == 1 && graph[source][destination] == 1){
            path[path.length - 1] = destination;
            System.out.println(Arrays.toString(path));
            return 1;
        }
        if (depth <= 0)return 0;

        // Initialize result
        int count = 0;

        // Go to all adjacents of source and recur
        for (int i = 0; i < V; i++)
            if (graph[source][i] == 1)  // Check if is adjacent of source
                count += countwalks(graph, i,  destination,   depth-1, path);

        return count;
    }

    // Driver method
    public static  void main (String[] args) throws java.lang.Exception
    {

        int graph[][] =new int[][] { {1, 1, 1, 1, 0, 1},
                {0, 0, 0, 0, 1, 0},
                {0, 0, 0, 0, 1, 0},
                {0, 0, 0, 1, 0, 1},
                {0, 0, 0, 0, 0, 1},
                {0, 0, 0, 0, 0, 0}
        };
        int source = 0,  destination = 5,   depth = 3;
          KPaths p = new   KPaths();
          int[] path = new int[depth + 1];

        p.countwalks(graph, source, destination, depth, path);

    }
}