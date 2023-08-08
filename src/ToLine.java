public class ToLine {
    int[][] data;

    public ToLine(int[][] data) {
        this.data = data;
    }

    int[] resize() {
        int num = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                num++;
            }
        }

        int[] res = new int[num];

        for (int k = 0; k < data.length; k++) {
            for (int t  = 0; t < data[k].length; t++) {
                res[t] = data[k][t];
                System.out.println(res[t]);
            }
        }

        return res;
    }
}
