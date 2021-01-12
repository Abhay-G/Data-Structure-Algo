
/* class Node{
int data;
ArrayList<Node>children = new ArrayList<>();
}*/



public static int height(Node node) {
        int h = -1;

        for (Node child: node.children) {
            int ch = height(child);
            h = Math.max(h, ch);
        }
        h += 1;

        return h;
    }
