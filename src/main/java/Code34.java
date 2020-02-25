/**
 * 给你一个数组arr,和一个整数aim  可以任意选择arr中的数字  可不可以累加到aim
 */
public class Code34 {
    public static boolean isSum(int[] arr, int i, int sum, int aim) {
        if (i == arr.length) {
            return sum == aim;
        }
        return isSum(arr, i + 1, sum, aim)||isSum(arr, i + 1, sum + arr[i], aim);
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 89, 10};
        boolean b = isSum(arr, 0, 0, 99);
        System.out.println(b);
    }
}
