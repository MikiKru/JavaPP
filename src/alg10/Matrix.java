package alg10;

public class Matrix {

    int matrix [][] = { {1,1,1}, {2,2,2}, {3,3,3} };
//    int matrix3D [][][] ={ { {1,2},{3,4} }, { {5,6},{7,9} } };
//    int matrix3x3 [][][] =  {
//                                { {1,2,3}, {4,5,6}, {7,8,9} } ,
//                                { {10,11,12}, {13,14,15}, {16,17,18} },
//                                { {19,20,21}, {22,23,24}, {25,26,27} }
//                            };

    public void printMatrix(){
        for(int i = 0; i < matrix.length; i++){
            for (int j = 0; j< matrix[i].length; j++){
                System.out.printf("%3d", matrix[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Matrix m = new Matrix();
        m.printMatrix();
//        System.out.println(m.matrix3D[1][1][0]);
//        System.out.println(m.matrix3D[0][0][1]);
//        System.out.println(m.matrix3D[1][0][1]);
//        System.out.println(m.matrix3x3[1][1][0]);



    }


}
