public class MainAppTrees {
    public static void main(String[] args) {

        Tree myTree = new Tree();
        int[] numberArray = new int[]{10, 6, 8, 20, 4, 9, 5, 17, 42, 47, 29};
        for (int i = 0; i < 11; i++) myTree.insert(numberArray[i]);
        System.out.println("Pre-Order Traversal Tree");
        myTree.traversePreOrder();
    }
}
