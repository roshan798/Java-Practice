public class MatrixMultiplication {
    public static void main(String[] args) {
        int [][]mat1=new int[][]{{1,1},{1,1}};
        int [][]mat2=new int[][]{{2,3},{1,1}};
        int [][]mat=new int [3][3];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    mat[i][j]=mat[i][j]+mat1[i][k]*mat2[k][j];
                }
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.printf("%d  ",mat[i][j]);
            }
            System.out.println();
        }
    }
}
// 1 2 3
// 4 5 6
// 7 8 9

