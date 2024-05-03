public class Main {
    public static void main(String[] args) {
        DrzewoBST tree = new DrzewoBST();
        tree.add(tree.getRoot(), 20);
        tree.add(tree.getRoot(), 30);
        tree.add(tree.getRoot(), 27);
        tree.add(tree.getRoot(), 10);
        tree.add(tree.getRoot(), 15);
        tree.add(tree.getRoot(), 17);
        tree.add(tree.getRoot(), 16);
        tree.add(tree.getRoot(), 18);
        tree.Remove(tree.getRoot(), 10);
        tree.inorder(tree.getRoot());
        System.out.println("");
        System.out.println(tree.Getmin(tree.getRoot()).getDane());
        System.out.println(tree.GetMax(tree.getRoot()).getDane());
        try {
            System.out.println(tree.Find(tree.getRoot(), 16).getDane());
            System.out.println(tree.Find(tree.getRoot(), 116).getDane());
        } catch (NullPointerException e) {
            System.out.println("Brak podanej wartości w drzewie");
        }
    }
}
