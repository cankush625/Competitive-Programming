class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();

        if (root == null) {
            return result;
        }
                
        Queue<Node> queue = new LinkedList<Node>();
        
        List<Integer> tempList = new ArrayList<Integer>();
        
        queue.add(root);
        queue.add(null);
        
        while (!queue.isEmpty()) {
            Node temp = queue.poll();
            
            if (temp != null) {
                tempList.add(temp.val);
                
                if (temp.children != null) {
                    List<Node> childs = temp.children;
                    for (Node n : childs) {
                        queue.add(n);
                    }
                }
            } else {
                result.add(tempList);
                tempList = new ArrayList<Integer>();
                
                if (queue.isEmpty()) {
                    return result;
                } else {
                    queue.add(null);
                }
            }
        }
        return result;
    }
}