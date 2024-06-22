package cs2130;

public class Main {

    public static void main(String[] args) {
        // Making the matrix
        int[][] temp = {{0, 1, 1, 1}, {0, 0, 1, 0}, {0, 0, 1, 0}, {0, 0, 1, 0}};
        MatrixRelation matrixO = new MatrixRelation(temp);
        System.out.println("The Original Matrix:");
        matrixO.show();

        // Print the Reflexive Closure
        MatrixRelation matrixRC = matrixO.reflexiveClosure();
        System.out.println("\nMatrix with Reflexive Closure:");
        matrixRC.show();

        // Print the Symmetric Closure
        MatrixRelation matrixSC = matrixO.symmetricClosure();
        System.out.println("\nMatrix with Symmetric Closure:");
        matrixSC.show();

        // Print if Rooted Tree
        boolean tree = matrixO.isRootedTree();
        if (tree == true) {
            System.out.println("\nThis matrix can be shown as a rooted tree.");
        }
        else {
            System.out.println("\nThis matrix cannot be shown as a rooted tree.");
        }
    }
}
