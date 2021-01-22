/*class Node{
int data;
ArrayList<Node>children = new ArrayList<>();
}*/

    public static void removeLeaves(Node node) {
        
        for(int i = node.children.size()-1;i>=0;i--)
        {
            Node ch = node.children.get(i);
            if(ch.children.size()==0)
            {
                node.children.remove(ch);
            }
        }
        
        for(Node child:node.children)
        {
            removeLeaves(child);
        }
    }
