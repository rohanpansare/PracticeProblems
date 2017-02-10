import b.b.B;

import java.util.*;

/**
 * Created by rohanpansare on 1/23/2017.
 */


public class CloneGraph {


    public static void main(String[] args) {
        Node source = new Node();
        source.value = 1;
        source.neighbors = new ArrayList<>();
        //source.neighbors.add()
        Node B = new Node();
        B.value = 2;
        B.neighbors = new ArrayList<>();
        Node C = new Node();
        C.value = 3;
        C.neighbors = new ArrayList<>();
        Node D = new Node();
        D.value = 4;
        D.neighbors = new ArrayList<>();
        source.neighbors.add(B);
        source.neighbors.add(C);
        B.neighbors.add(C);
        B.neighbors.add(D);
        C.neighbors.add(D);
        D.neighbors.add(source);
        Node clonecopy = cloneGraph(source);
    }

    public static Node cloneGraph(Node source){

        Map<Node,Node> hm = new HashMap<>();
        Queue<Node> queue = new LinkedList<>();
        Node temp = new Node();
        temp.value = source.value;
        temp.neighbors = new ArrayList<>();
        hm.put(source,temp);
        queue.add(source);
        while(!queue.isEmpty()){
            Node clone;
            Node copy = queue.remove();
            if(!hm.containsKey(copy)){
                clone = new Node();
                clone.value = copy.value;
                clone.neighbors = new ArrayList<>();
                hm.put(copy,clone);
            }
            else{
                clone = hm.get(copy);
            }
            for(int i = 0 ; i < copy.neighbors.size();i++) {
                if (!hm.containsKey(copy.neighbors.get(i))) {
                    Node clone1 = new Node();
                    clone1.value = copy.neighbors.get(i).value;
                    clone.neighbors = new ArrayList<>();
                    clone.neighbors.add(clone1);
                    hm.put(copy, clone);
                } else {
                    clone.neighbors.add(hm.get(copy.neighbors.get(i)));
                }
                queue.add(copy.neighbors.get(i));
            }
        }


        return temp;
    }
}

class Node{
    int value;
    List<Node> neighbors;
}
