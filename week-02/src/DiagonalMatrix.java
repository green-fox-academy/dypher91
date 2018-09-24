public class DiagonalMatrix {
    public static void main(String[] args) {
        // - Create (dynamically) a two dimensional array
        //   with the following matrix. Use a loop!
        //
        //   1 0 0 0
        //   0 1 0 0
        //   0 0 1 0
        //   0 0 0 1
        //
        // - Print this two dimensional array to the output

        int[][] multi = new int[4][4];
        int i, j;
        for (i = 0; i < multi.length; i++) {
            for (j = 0; j <= i; j++) {
                if (i == j) {
                    multi[i][j] = 1;
                } else {
                    multi[i][j] = 0;
                }
            }
        }

        for (i = 0; i < multi.length; i++) {
            for (j = 0; j < multi.length; j++) {

                System.out.print(multi[i][j]);
            }
            System.out.println();
        }

    }
}
