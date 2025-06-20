import java.util.Arrays;

public class RandomStats {
    public static void main(String[] args) {
        int[] arr = generate4DigitRandomArray(5);
        double[] res = findAverageMinMax(arr);
        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Average: " + res[0] + ", Min: " + res[1] + ", Max: " + res[2]);
    }

    public static int[] generate4DigitRandomArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) arr[i] = (int) (Math.random() * 9000) + 1000;
        return arr;
    }

    public static double[] findAverageMinMax(int[] nums) {
        int sum = 0, min = nums[0], max = nums[0];
        for (int n : nums) {
            sum += n;
            if (n < min) min = n;
            if (n > max) max = n;
        }
        return new double[]{(double) sum / nums.length, min, max};
    }
}
