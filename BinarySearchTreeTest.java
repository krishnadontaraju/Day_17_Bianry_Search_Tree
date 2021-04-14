import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BinarySearchTreeTest {
    @Test
    public void givenThreeNumbers_whenAddedToTree_ShouldReturnSizeThree(){
        BinarySearchTree<Integer> customBinaryTree = new BinarySearchTree<>();
        customBinaryTree.add(56);
        customBinaryTree.add(30);
        customBinaryTree.add(70);

        int size = customBinaryTree.getSize();
        Assertions.assertEquals(3,size);
    }
}
