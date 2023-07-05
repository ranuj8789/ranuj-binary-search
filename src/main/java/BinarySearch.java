import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = new int[]{95, 43, 23, 43, 12, 43, 65, 34, 23, 12, 54, 32, 54};
        Arrays.sort(array);
        for (int number : array) {
            System.out.println(binarySearchIterative(array, number));
        }
        for (int number : array) {
            System.out.println(binarySearchRecursive(array, 0, array.length - 1, number) + "numer is " + number);
        }


    }

    public static boolean binarySearchIterative(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) {
                return true;
            } else if (target > arr[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }

    public static boolean binarySearchRecursive(int[] arr, int left, int right, int target) {
        if (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) {
                return true;
            } else if (target > arr[mid]) {
                return binarySearchRecursive(arr, mid + 1, right, target);
            } else {
               return binarySearchRecursive(arr, left, mid - 1, target);
            }
        }
        return false;
    }
}
