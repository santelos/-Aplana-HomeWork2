/**
 * Created by Петр on 26.04.2017.
 */
public class Task_3 {
    public static void main(String[] args) {

        int[][] mat = new int[4][4];
        int[][] mat1 = new int[0][0];
        int[][] mat2 = new int[4][4];
        int[][] mat3 = new int[4][5];
        int[][] mat4 = new int[-1][2];

        Matrix.addRandom(mat);
        Matrix.addRandom(mat2);
        Matrix.addRandom(mat3);
        Matrix.addRandom(mat4);

        System.out.println("Матрица 1");
        Matrix.display(mat);
        System.out.println("Матрица 2");
        Matrix.display(mat2);
        System.out.println("Матрица 3");
        Matrix.display(mat3);

        System.out.println("Сумма mat+mat2");
        Matrix.display(Matrix.sum(mat,mat2));
        System.out.println("Сумма mat+mat3");
        Matrix.display(Matrix.sum(mat,mat3));

        System.out.println("Размер mat1= "+Matrix.getSize(mat1)[0]+"x"+Matrix.getSize(mat1)[1]);
    }
}
