// https://leetcode.com/problems/clone-graph/?envType=problem-list-v2&envId=rab78cw1



/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    Map<Integer, Node> cloneNodeMap = new HashMap<Integer, Node>();
    public Node cloneGraph(Node node) {
         if (node == null) {
            return null;
        }
        Node cloneNode = new Node(node.val);

        if(cloneNodeMap.get(node.val) == null){
            cloneNodeMap.put(node.val, cloneNode);
            for(int i = 0; i < node.neighbors.size(); i++){
                cloneNode.neighbors.add(cloneGraph(node.neighbors.get(i)));
            }
        }
        else{
            return cloneNodeMap.get(node.val);
        }        
        return cloneNode;
    }
}