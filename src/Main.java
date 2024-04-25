// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        DrzewoBST tree = new DrzewoBST();
        tree.add(tree.getRoot(),20);
        tree.add(tree.getRoot(),30);
        tree.add(tree.getRoot(),27);
        tree.add(tree.getRoot(),10);
        tree.add(tree.getRoot(),15);
        tree.add(tree.getRoot(),17);
        tree.add(tree.getRoot(),16);
        tree.add(tree.getRoot(),18);
        tree.setRoot(tree.Remove(tree.getRoot(), 30));
        System.out.println(tree.Getmin(tree.getRoot()).getDane());
        System.out.println(tree.GetMax(tree.getRoot()).getDane());
        System.out.println(tree.Find(tree.getRoot(),15).getDane());


    }
}
