package cn.howel.everyday;

public class recoveries {

    public static int removeElement(int[] nums, int val) {
        int j = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                if (nums[j] != val) {
                    nums[i] = nums[j];
                    j--;
                } else {
                    nums[j] = -1;
                    j--;
                }
            }
            if (i == j) {
                return i + 1;
            }
        }
        return j + 1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 3, 4, 2};
        System.out.println(removeElement(nums, 3));
    }

}
