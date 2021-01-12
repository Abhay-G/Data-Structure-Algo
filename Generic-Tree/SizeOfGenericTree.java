
/*class Node{
int data;
ArrayList<Node>children = new ArrayList<>();
}*/

public static int size(Node node) {
        int s = 0;

        for (Node child: node.children) {
            s += size(child);
        }
        s += 1;

        return s;
    }
