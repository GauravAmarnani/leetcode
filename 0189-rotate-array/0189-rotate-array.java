class Solution {
    public void rotate(int[] nums, int k) {
        //rotateOnSameArray(nums, k);
        rotateOnAnotherArray(nums, k);
    }

    public void rotateOnSameArray(int[] nums, int k) {
        for(int i = 0; i < k; i++) {
            int f = nums[nums.length-1];
            for(int j = nums.length-1; j > 0; j--) {
                nums[j] = nums[j-1];
            }
            nums[0] = f;
            System.out.println("I" + i + " = " + Arrays.toString(nums));
        }
    }

    public void rotateOnAnotherArray(int[] nums, int k) {
        if(nums.length <= 1)
            return;
        int[] another = new int[nums.length];
        k = k % nums.length;
        int index = nums.length - k;
        int temp = 0;
        for(int i = index; i < nums.length; i++)
            another[temp++] = nums[i];
        for(int i = 0; i < index; i++) 
            another[temp++] = nums[i];
        for(int i = 0; i < another.length; i++) 
            nums[i] = another[i];
    }
}