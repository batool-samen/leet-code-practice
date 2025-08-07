class Solution {
    public int jump(int[] nums) {
        int counter=0;
int numberOfJumps=0;
int farthestJumpToRearch=0;

for (int i=0;i<nums.length-1;i++)
{
 farthestJumpToRearch=Math.max( farthestJumpToRearch,i+nums[i]);


if (i==numberOfJumps){
counter++;
numberOfJumps= farthestJumpToRearch;

}

}return counter;


        
    }
}