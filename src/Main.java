import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int SIZE = 8;
        int[][] colors = new int[SIZE][SIZE];

        //Random Number
        for (int i=0; i<SIZE; i++) {
            for (int j=0; j<SIZE; j++) {
                Random rand = new Random();
                colors[i][j] = rand.nextInt(256);
            }
        }
        for (int i=0; i<SIZE; i++) {
            for (int j=0; j<SIZE; j++) {
                System.out.format("%4d", colors[i][j]);
            }
            System.out.println();
        }

        System.out.println();

        //Rotate Numbers
        int[][] rotatedColors = new int[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++)
        {
            for (int j = 0; j < SIZE; j++)
            {
                rotatedColors[i][j] = colors[SIZE-1-j][i];
            }
        }
        for (int i=0; i<SIZE; i++) {
            for (int j=0; j<SIZE; j++) {
                System.out.format("%4d", rotatedColors[i][j]);
            }
            System.out.println();
        }
    }
}