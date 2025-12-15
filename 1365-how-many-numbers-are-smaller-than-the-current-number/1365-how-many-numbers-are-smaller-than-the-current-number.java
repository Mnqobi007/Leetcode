import java.util.ArrayList;
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int count = 0;
        ArrayList<Integer> smallerCount = new ArrayList<>();

        for(int i = 0; i<nums.length; i++){
            for(int j=0; j<nums.length; j++){
                if(nums[j] < nums[i]){
                     count++;
                }

            }
            smallerCount.add(count);
            count = 0;
        }
        
        int[] results = new int[smallerCount.size()];
        for(int i = 0; i<smallerCount.size(); i++){
            results[i] = smallerCount.get(i);
        }

        return results;
        
    }
}