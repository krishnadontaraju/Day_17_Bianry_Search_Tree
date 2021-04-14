public class BinarySearchTree<K extends Comparable<K>> {
    private BinaryNode<K> root;

    public void add (K key){
        this.root = this.addRecursive(root,key);
}

    private BinaryNode<K> addRecursive(BinaryNode<K> currentNode, K key) {
        if (currentNode == null)
            return new BinaryNode<>(key);
        int comparisonResult = key.compareTo(currentNode.key);
        if (comparisonResult == 0)
            return currentNode;
        if (comparisonResult < 0)
            currentNode.leftNode = addRecursive(currentNode.leftNode , key);
        else
            currentNode.rightNode = addRecursive(currentNode.rightNode , key);
        return currentNode;
    }

    public int getSize(){
        return this.getSizeRecursive(root);
    }

    private int getSizeRecursive(BinaryNode<K> currentNode) {
        return currentNode == null ? 0 : 1 + this.getSizeRecursive(currentNode.leftNode)
                                            + this.getSizeRecursive(currentNode.rightNode);
    }
}
