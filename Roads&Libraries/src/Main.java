import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    static int citiesCount;
    static int roadsCount;
    static int roadsBuilt;
    static ArrayList<Node> cities;

    class Node{
        int id;
        int adjacencyList[];
        boolean connected;
        boolean visited;
    }


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            citiesCount = in.nextInt();
            roadsCount = in.nextInt();
            int libraryCost = in.nextInt();
            int roadCost = in.nextInt();


            for(int a1 = 0; a1 < citiesCount; a1++){
                int city_1 = in.nextInt();
                int city_2 = in.nextInt();
            }
        }
        int[][] repairedRoads = new int[citiesCount][citiesCount];
    }



}
