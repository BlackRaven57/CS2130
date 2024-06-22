package cs2130;

// Binary Relation Matrix class
public class MatrixRelation
{
    // Instance variables
    private int matrix[][];
    public int size;

    // Boolean Matrix Constructors
    public MatrixRelation(int s)
    {
        size = s;
        matrix = new int[size][size];
        // Fill with zeros
        for(int row = 0; row < size; row++){
            for(int col = 0; col < size; col++){
                matrix[row][col] = 0;
            }
        }
    }

    public MatrixRelation(int[][] other)
    {
        size = other.length;
        matrix = new int[size][size];
        // Copy matrix B values into matrix
        for(int row = 0; row < size; row++){
            for(int col = 0; col < size; col++){
                matrix[row][col] = other[row][col];
            }
        }
    }

    // Boolean Matrix Methods
    public void show()
    {
        // Display matrix
        for(int row = 0; row < size; row++){
            for(int col = 0; col < size; col++){
                System.out.print("  " + matrix[row][col]);
            }
            System.out.println();
        }
        return;
    }

    public boolean isEqual(MatrixRelation other)
    {
        // Check if current matrix equals matrix M2
        for(int row = 0; row < size; row++){
            for(int col = 0; col < size; col++){
                if(this.matrix[row][col] != other.matrix[row][col])
                    return false;
            }
        }
        return true;
    }

    public int arrows()
    {
        // No. of 1's in matrix
        int narrows = 0;
        for(int row = 0; row < size; row++){
            for(int col = 0; col < size; col++){
                narrows = narrows + matrix[row][col];
            }
        }
        return narrows;
    }

    public MatrixRelation join(MatrixRelation other)
    {
        // Join to matrices together by performing a
        // logical OR of current matrix with matrix other
        // Don't modify this matrix "in-place" (i.e. make a copy)
        // TODO: Put code here...
        MatrixRelation result = new MatrixRelation(size);
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if ((this.matrix[i][j] == 1)||(other.matrix[i][j] == 1)) {
                    result.matrix[i][j] = 1;
                }
                else {
                    result.matrix[i][j] = 0;
                }
            }
        }
        return result;

    }

    public MatrixRelation transpose()
    {
        // Transpose of current matrix
        // Switch the rows to columns and the columns to rows
        // Don't modify this matrix "in-place" (i.e. make a copy)
        // TODO: Put code here...
        MatrixRelation result = new MatrixRelation(size);
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                result.matrix[j][i] = this.matrix[i][j];
            }
        }
        return result;

    }

    public MatrixRelation reflexiveClosure()
    {
        // Reflexive closure of current matrix
        // Add the necessary arrows to make the matrix reflexive
        // TODO: Put code here...
        MatrixRelation result = new MatrixRelation(size);
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j) {
                    result.matrix[i][j] = 1;
                }
                else {
                    result.matrix[i][j] = this.matrix[i][j];
                }
            }
        }
        return result;
    }

    public MatrixRelation symmetricClosure()
    {
        // Symmetric closure of current matrix
        // Add the necessary arrows to make the matrix symmetric.
        // You may want to consider how the transpose of the matrix could be useful here.
        // TODO: Put code here...
        MatrixRelation result = new MatrixRelation(size);
        result = join(this.transpose());
        return result;
    }

    public int inDegree(int node)
    {
        // Number of arrows INTO node of digraph
        // Nodes are numbered 0,1,2,...,SIZE-1
        // TODO: Put code here...
        int degree = 0;
        for (int i = 0; i < size; i++) {
            if (this.matrix[i][node] == 1) {
                degree++;
            }
        }
        return degree;
    }

    public int outDegree(int node)
    {
        // Number of arrows FROM node of digraph
        // Nodes are numbered 0,1,2,...,SIZE-1
        // TODO: Put code here...
        int degree = 0;
        for (int i = 0; i < size; i++) {
            if (this.matrix[node][i] == 1) {
                degree++;
            }
        }
        return degree;
    }


    public boolean isRootedTree()
    {
        // Determine if this binary relation could represent a directed rooted tree
        // This means that there is exactly 1 node with in-degree of zero
        // and every other node has an in-degree of 1.
        // TODO: Put code here...
        int zero = 0;
        int ones = 0;
        int other = 0;
        boolean rooted = true;
        for (int i = 0; i < size; i++) {
            if (inDegree(i) == 0) {
                zero++;
            }
            else if (inDegree(i) == 1) {
                ones++;
            }
            else {
                other++;
            }
        }
        if (zero > 1) {
            rooted = false;
        }
        else if (other > 0) {
            rooted = false;
        }
        return rooted;
    }

} // end class
