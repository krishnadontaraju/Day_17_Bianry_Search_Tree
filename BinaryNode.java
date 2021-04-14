public class BinaryNode <K extends Comparable<K>>{
    K key;
    BinaryNode<K> leftNode;
    BinaryNode<K> rightNode;

    BinaryNode(K key){
        this.key = key;
        this.leftNode = null;
        this.rightNode = null;
    }
}
