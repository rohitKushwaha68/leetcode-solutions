class Solution {
    public int trap(int[] height) {
        
        int n=height.length;
        int preMax[]= new int[n];
        int suffMax[]= new int[n];

        for(int i=0;i<n;++i){
            if(i==0){
            preMax[i]=height[i];
            suffMax[n-1]=height[n-1];
            }else{
                preMax[i]=Math.max(height[i],preMax[i-1]);
                suffMax[n-i-1]=Math.max(height[n-i-1],suffMax[n-i]);
            }
        }

        int total=0;
        for(int i=0;i<n;++i){
            if(height[i]<preMax[i] && height[i]<suffMax[i]){
             total=total+(Math.min(preMax[i],suffMax[i])-height[i]);
            }
        }
        return total;
    }
}