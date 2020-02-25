/**
 * @ClassName Code39
 * @Deacription:
 * @Author zzx
 * @Date 2020/2/20 10:39
 **/

public class Code39 {

    public int removeDuplicates(int[] nums) {
        if (nums.length < 1) {
            return 0;
        }
        int index = nums[0];
        int cur = 1;
        for (int i = 1; i < nums.length; i++) {
            if (index == nums[i]) {

            } else {
                nums[cur++] = nums[i];
                index = nums[i];
            }

        }
        return cur;
    }

    public int removeElement(int[] nums, int val) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index++] = nums[i];
            }
        }
        return index;
    }

    public static void main(String[] args) {
        new Code39().strStr("a", "a");
    }

    public int strStr(String haystack, String needle) {
        if (needle.trim().equals("")) {
            return 0;
        }

        for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
            for (int j = 0; j < needle.length(); j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    break;
                }
                if (j == needle.length() - 1) {
                    return i;
                }
            }
        }
        return -1;

    }

    public void nextPermutation(int[] nums) {
        int i = nums.length - 2;
        while (i>=0&&nums[i+1]<=nums[i]){
            i--;
        }
        if (i>=0){
            int j=nums.length-1;
            while (j>=0&&nums[j]<=nums[i]){
                j--;
            }
            swap(nums,i,j);
        }
        reverse(nums,i+1);

    }
    private void reverse(int[] nums, int start) {
        int i = start, j = nums.length - 1;
        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }


    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }


    public int search(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        int index;

        while (left<=right){
            index=(left+right)/2;
            if (nums[index]==target){
                return index;
            }
            if (nums[left]<=nums[index]){
                if (target>=nums[left]&&target<=nums[index]){
                    right=index;
                }else left=index+1;

            }else {
                if (target>nums[index]&&target<=nums[right]){
                    left=index;
                }else right=index-1;
            }



        }
        return -1;


    }

}
