import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int massive[][] = new int[5][5];
        for (int i = 0; i < massive.length; i++) {
            for (int j = 0; j < massive[i].length; j++) {
                massive[i][j] = (int) (Math.random() * 100);
                System.out.print(massive[i][j] + " ");
            }
            System.out.println();
            Arrays.sort(massive[i]);
            for (int y = 0; y < massive[i].length; y++) {
                System.out.print(massive[i][y] + " ");
            }
            System.out.println();
            for (int z = massive[i].length - 1; z >= 0; z--) {
                System.out.print(massive[i][z] + " ");
            }
            System.out.println("\n");
        }
    }
}
