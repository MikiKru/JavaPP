package alg10;

public class Matrix {

    int matrix [][] = { {1,1,1}, {2,2,2}, {3,3,3} };
    int matrixNeo [][] = { {1,1,1}, {1,1,1}, {2,2,2} };

    public void printMatrix(){
        for(int i = 0; i < matrix.length; i++){
            for (int j = 0; j< matrix[i].length; j++){
                System.out.printf("%3d", matrix[i][j]);
            }
            System.out.println();
        }
    }
    public void addMatrix(){
        for(int i = 0; i < matrix.length; i++){
            for (int j = 0; j< matrix[i].length; j++){
                System.out.printf("%3d", (matrix[i][j]+matrixNeo[i][j]));
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Matrix m = new Matrix();
        m.printMatrix();
        System.out.println();
        m.addMatrix();

    }


}
