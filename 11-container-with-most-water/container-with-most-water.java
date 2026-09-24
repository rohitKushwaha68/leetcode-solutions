class Solution {
    public int maxArea(int[] height) {

     int maxVolume= Integer.MIN_VALUE;
     int l=0;
     int h=height.length-1;

     while(l<h){
       int currVolume=(h-l)*Math.min(height[l],height[h]);
       maxVolume=Math.max(maxVolume,currVolume);
         if(height[l]<height[h])
            ++l;
         else
            --h;   
     }

     return maxVolume;

    }
}