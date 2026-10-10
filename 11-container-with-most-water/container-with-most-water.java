class Solution {
    public int maxArea(int[] height) {

        int maxVol=Integer.MIN_VALUE;
        int low=0;
        int high=height.length-1;

        while(low<high){
            
            maxVol=Math.max(maxVol,Math.min(height[low],height[high])*(high-low));

            if(height[low]<=height[high]){
                ++low;
            }else{
                --high;
            }
        }

        return maxVol;
    }
}