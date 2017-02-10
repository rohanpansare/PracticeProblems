import java.util.*;

class AdjacencyList {

    public static void main(String[] args) {

        // empty ArrayList
        ArrayList<ArrayList<Integer>> adjLists = new ArrayList<>();
        // insert n=6 ArrayLists
        int n = 6;
        for(int i=0; i<n; i++){
            adjLists.add(new ArrayList<Integer>());
        }

        // insert neighbors into list for vertex 0
        adjLists.get(0).add(1);
        adjLists.get(0).add(2);

        // insert neighbors into list for vertex 1
        adjLists.get(1).add(2);
        adjLists.get(1).add(3);

        // insert neighbors into list for vertex 2
        adjLists.get(2).add(4);

        // insert neighbors into list for vertex 3
        adjLists.get(3).add(4);
        adjLists.get(3).add(5);

        // insert neighbors into list for vertex 4
        adjLists.get(4).add(5);

        // insert neighbors into list for vertex 5
        // -> nothing to do since 5 has no neighbors


        // testing
        System.out.println("Neigbors of vertex 0: " + adjLists.get(0));
        System.out.println("Neigbors of vertex 5: " + adjLists.get(5));

        System.out.println("\nPrint all adjacency lists with corresponding vertex:");
        for(int v=0; v<n; v++){
            System.out.println(v + ": " + adjLists.get(v));
        }
    }

}