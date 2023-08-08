public class ToTable {

    int[] data;
    int x;
    int y;

    public ToTable(int[] data, int x, int y) {
        this.data = data;
        this.x = x;
        this.y = y;
    }

    int[][] resize() {
        // склеиваем двумерный массив в один при помощи start
        int[][] res = new int[x][y];
        int start = 0;
        for (int i = 0; i < x; i++) {
            for (int j = start; j < start + y; j++) {
                res[i][j - start] = data[j];
            }
            start = start + y;

        }
        for (int h = 0; h < x; h++) {
            for (int t = 0; t < y; t++) {
                System.out.print(res[h][t]);
            }
            System.out.println(" ");
        }


        return res;
    }
}

