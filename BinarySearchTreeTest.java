import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BinarySearchTreeTest {
    @Test
    public void givenThreeNumbers_whenAddedToTree_ShouldReturnSizeThree(){
        BinarySearchTree<Integer> customBinaryTree = new BinarySearchTree<>();
        customBinaryTree.add(56);
        customBinaryTree.add(30);
        customBinaryTree.add(70);
        customBinaryTree.add(22);
        customBinaryTree.add(40);
        customBinaryTree.add(60);
        customBinaryTree.add(95);
        customBinaryTree.add(11);
        customBinaryTree.add(65);
        customBinaryTree.add(3);
        customBinaryTree.add(16);
        customBinaryTree.add(63);
        customBinaryTree.add(67);

        int size = customBinaryTree.getSize();
        Assertions.assertEquals(13,size);
    }
}
