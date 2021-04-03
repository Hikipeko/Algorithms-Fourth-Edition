public class Shuffle {
    public static void main(String[] args) {
        int times = 1000000;
        int length = 10;
        int[] arr = new int[length];
        int[][] result = new int[length][length];

        for (int i = 0; i < times; i++) {
            for (int j = 0; j < length; j++)
                arr[j] = j;
            shuffle(arr);
            for (int j = 0; j < length; j++) {
                result[arr[j]][j]++;
            }
        }
        for (int i = 0; i < length; i++) {
            StdOut.printf("%3d appears ", i);
            for (int j = 0; j < length; j++) {
                StdOut.printf(" %8d ", result[i][j]);
            }
            StdOut.printf("\n");
        }
    }

    public static void shuffle(int[] a) {
        int N = a.length;
        for (int i = 0; i < N; i++) {
            int r = 0 + StdRandom.uniform(N - 0);
            int temp = a[i];
            a[i] = a[r];
            a[r] = temp;
        }
    }
}
