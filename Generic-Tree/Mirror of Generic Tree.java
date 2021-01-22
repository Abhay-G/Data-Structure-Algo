/*class Node{
int data;
ArrayList<Node>children = new ArrayList<>();
}*/


public static void mirror(Node node) {
        
        for(Node child : node.children)
        {
            mirror(child);
        }
        Collections.reverse(node.children);
    }
