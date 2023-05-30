import java.util.*;

class Solution {
    public int majorityElement(int[] nums) {
        int limit = nums.length/2;
        HashMap<Integer, Integer> myMap = new HashMap<>();
        if(nums.length == 1 || nums.length == 2) 
            return nums[0];
        for(int i = 0; i < nums.length; i++) {
            if(myMap.containsKey(nums[i])) {
                int newValue = myMap.get(nums[i]) + 1;
                if(newValue > limit)
                    return nums[i];
                myMap.replace(nums[i], newValue);
            }
            else {
                myMap.put(nums[i], 1);
            }
        }
        return -1;
    }
}