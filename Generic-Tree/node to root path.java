 public static ArrayList < Integer > nodeToRootPath(Node node, int data) {
        // write your code here
        
        
        if(node.data == data)
        {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(node.data);
            return list;
            
        }
        
        
        
        for(Node child:node.children)
        {
            ArrayList<Integer> list = nodeToRootPath(child,data);
            if(list.size()>0)
            {
                list.add(node.data);
                return list;
            }
        }
        return new ArrayList < Integer > ();


    }
