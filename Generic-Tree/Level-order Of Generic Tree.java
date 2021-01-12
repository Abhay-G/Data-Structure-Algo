/*class Node{
int data;
ArrayList<Node> children = new ArrayList<>();
}
/*

    public static void levelOrder(Node node) {
        // write your code here
        Queue < Node > que = new ArrayDeque < > ();

        que.add(node);

        while (que.size() > 0) {

            System.out.print(que.peek().data + " ");
            for (Node child: que.peek().children) {
                que.add(child);
            }
            que.remove();
        }
        System.out.print(".");
    }
