package alg10;

public class Matrix {

    int matrix [][] = { {1,2,3}, {4,5,6}, {7,8,9} };
    int matrixNeo [][] = { {1,2,3}, {4,5,6}, {7,8,9} };
    int product [][] = {{0,0,0},{0,0,0},{0,0,0}};
    public void printMatrix(){
        for(int i = 0; i < product.length; i++){
            for (int j = 0; j< product[i].length; j++){
                System.out.printf("%5d", product[i][j]);
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
    public void subMatrix(){
        for(int i = 0; i < matrix.length; i++){
            for (int j = 0; j< matrix[i].length; j++){
                System.out.printf("%3d", (matrix[i][j]-matrixNeo[i][j]));
            }
            System.out.println();
        }
    }


    public void multiplyMatrix(){
        int sum = 0;
        for(int i = 0; i < matrix.length; i++){
            for (int j = 0; j< matrix[i].length; j++){
                for (int k = 0; k < matrix[i].length; k++) {
                    product[i][j] += matrix[i][k] * matrixNeo[k][j];
                }
            }
        }
    }

    public static void main(String[] args) {
        Matrix m = new Matrix();
//        m.printMatrix();
//        System.out.println();
//        m.addMatrix();
//        System.out.println();
//        m.subMatrix();
        m.multiplyMatrix();
        m.printMatrix();

    }


}
