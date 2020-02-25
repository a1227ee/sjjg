import java.io.*;
import java.util.Scanner;

/**
 * @ClassName Code40
 * @Deacription:
 * @Author zzx
 * @Date 2020/2/24 0:45
 **/

public class Code40 {


    public int[] searchRange(int[] nums, int target) {

        int l=0;
        int r=nums.length-1;
        int index;
        while (l<=r){
            index=(r+l)/2;
            if (nums[index]==target){
                l=index;
                r=index;
                while (l-1>=0&&nums[l-1]==target) l--;
                while (r+1<nums.length&&nums[r]==target) r++;
                return new int[]{r,l};
            }
            if (nums[index]>target){
                r=index-1;
            }else {
                l=index+1;
            }
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        int[] a =new int[]{1,3,5,6};
           new Code40().searchInsert(a, 0);
    }

    public int searchInsert(int[] nums, int target) {
            int l=0;
            int r=nums.length-1;
            int index=0;
            while (l<=r){
                index=(r+l)/2;
                if (nums[index]==target){
                     return index;
                }
                if (nums[index]>target){
                    r=index-1;
                }else {
                    l=index+1;
                }
            }
            if (nums[index]>target){
                return index;
            }
            return ++index;

    }

}
