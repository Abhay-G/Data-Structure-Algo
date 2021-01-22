/*class Node{
int data;
ArrayList<Node>children = new ArrayList<>();
}*/

    public static void linearize(Node node) {
        // write your code here
        
        if(node.children.size()==0)
        {
            return;
        }
        
        for(Node child : node.children)
        {
            linearize(child);
        }
        
       while(node.children.size()>1)
        {
            Node lastchild = node.children.remove(node.children.size()-1);
            Node slc = node.children.get(node.children.size()-1);
            
            Node slckt = getTail(slc);
            
            slckt.children.add(lastchild);
        }
        
        
    }
    
    private static Node getTail(Node node)
    {
        while(node.children.size()==1)
        {
            node = node.children.get(0);
        }
        return node;
    }
