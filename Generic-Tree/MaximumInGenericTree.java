/*class Node{
int data;
ArrayList<Node>children = new ArrayList<>();
}*/

public static int max(Node node) {
        int m = Integer.MIN_VALUE;

        for (Node child: node.children) {
            int cm = max(child);
            m = Math.max(m, cm);
        }
        m = Math.max(m, node.data);

        return m;
    }
