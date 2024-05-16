import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 3, 9, 17};
        int target = 19;

        System.out.println(getIndex(nums, target));
    }

    private static int getIndex(int[] nums, int target) {

        int index = Arrays.binarySearch(nums, target);

        if (index >= 0) {
            return index;
        }
        return (index + 1) * (-1);

    }
}
