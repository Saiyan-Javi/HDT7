public class BinarySearchTree {
    private Node root;
    
    private class Node {
        private String key;
        private String value;
        private Node left, right;
        
        public Node(String key, String value) {
            this.key = key;
            this.value = value;
        }
    }
    
    public void put(String key, String value) {
        root = put(root, key, value);
    }
    
    private Node put(Node x, String key, String value) {
        if (x == null) return new Node(key, value);
        int cmp = key.compareTo(x.key);
        if (cmp < 0) x.left = put(x.left, key, value);
        else if (cmp > 0) x.right = put(x.right, key, value);
        else x.value = value;
        return x;
    }
    
    public String get(String key) {
        Node x = root;
        while (x != null) {
            int cmp = key.compareTo(x.key);
            if (cmp < 0) x = x.left;
            else if (cmp > 0) x = x.right;
            else return x.value;
        }
        return null;
    }
}
