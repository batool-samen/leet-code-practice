class Solution {
    public boolean canJump(int[] nums) {
        int currunt=0;

        for (int i=0;i<nums.length;i++){
            if (i>currunt){
    return false;
    }
int steps=i+nums[i];
    if (steps> currunt){
                currunt=steps;
            }
            
            
           
        }return true;
        }
    }
