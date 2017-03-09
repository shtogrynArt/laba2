public class Main {

    private static double a;
    private static double[] d;
    private static double[] t;

    public static void main(String[] args) {

        d = new double[]{842.2, 326.8, 485.0, 206.3};
        t = new double[]{21.87, 32.45, 13.01, 48.43};

        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < d.length; j++) {
                a = Math.pow(d[j], 1.4) + Math.pow(t[i], 1 / 3) / t[i]-d[j];
                System.out.printf("\n A(ij) = %f  d[%d] = %f  t[%d] = %f", a, j + 1, d[j], i + i, t[i]);
            }
        }
    }
}
