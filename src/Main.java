public class Main {
    public static void main(String[] args) {
        Tree myFavoriteMapleTree = new Tree (25, 50,
                100,TreeType.MAPLE);

        Tree myFavoriteOakTree = new Tree (55, 200,
                300,TreeType.OAK);

        myFavoriteOakTree.CallTallTree();
        myFavoriteMapleTree.CallTallTree();

        System.out.println(Tree.TRUNK_COLOR);
        Tree.callATree();
    }
}