import java.util.Random;

/**
 * Created by Петр on 26.04.2017.
 */
public class Matrix {

    public static void addRandom(int[][] InMatrix) {
        Random rand = new Random();
        for (int i=0; i<getSize(InMatrix)[0]; i++) {
            for (int j=0; j<getSize(InMatrix)[1];j++) {
                InMatrix[i][j]=rand.nextInt(100);
            }
        }
    }

    //возвращает массив, где [0] - кол-во строк, [1] - кол-во столбцов
    public static int[] getSize(int[][] InMatrix){
        try {
            return new int[] {InMatrix.length,InMatrix[InMatrix.length-1].length};
        }catch (IndexOutOfBoundsException e) {
            return new int[] {0,0};
        }
    }

    public static int[][] sum(int[][] Matrix1, int[][] Matrix2) {

        if ((getSize(Matrix1)[0]!=getSize(Matrix2)[0])||(getSize(Matrix1)[1]!=getSize(Matrix2)[1]))
            return new int[][]{};

        int[][] sumMatrix= new int[getSize(Matrix1)[0]][getSize(Matrix1)[1]];

        for (int i=0; i<getSize(Matrix1)[0]; i++) {
            for (int j=0; j<getSize(Matrix1)[1];j++) {
                sumMatrix[i][j]=Matrix1[i][j]+Matrix2[i][j];
            }
        }

        return sumMatrix.clone();
    }

    public static void display(int[][] InMatrix) {
        for (int i=0; i<getSize(InMatrix)[0]; i++) {
            for (int j=0; j<getSize(InMatrix)[1];j++) {
                System.out.printf("%3d ",InMatrix[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

}
