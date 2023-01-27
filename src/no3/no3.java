package no3;

public class no3 {
    public static void getNo3() {

        Tree tree = new Tree();

        System.out.println("Memasukan value: 25, 20, 15, 27, 30, 29, 26, 22, 32");
        tree.insert(25);
        tree.insert(20);
        tree.insert(15);
        tree.insert(27);
        tree.insert(30);
        tree.insert(29);
        tree.insert(26);
        tree.insert(22);
        tree.insert(32);




        // get size
        System.out.println("\nSize: " + tree.size());


        // traversal in order
        System.out.println("\nMelakukan Traversal in order ");
        tree.traverseInOrder();

        // get max
        System.out.println("\nMax: " + tree.max());

    }
}
