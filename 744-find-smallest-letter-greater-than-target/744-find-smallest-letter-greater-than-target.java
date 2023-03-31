class Solution {
    public char nextGreatestLetter(char[] arr, char target) {
        int left = 0, right = arr.length - 1;
        while(left <= right) {
            int mid = (left + right)/ 2;
            if(target < arr[mid]) 
                right = mid - 1;
            else 
                left = mid + 1;
        }
        return arr[left % arr.length];
    }
}