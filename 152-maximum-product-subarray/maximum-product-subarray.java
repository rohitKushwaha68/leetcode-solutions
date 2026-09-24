class Solution {
    public int maxProduct(int[] nums) {
        
        int n=nums.length;
        int maxPro=Integer.MIN_VALUE;
        int prePro=1;
        int suffPro=1;

        for(int i=0;i<n;++i){
            
            if(prePro==0)
              prePro=1;
            if(suffPro==0)
              suffPro=1;  

            prePro=prePro*nums[i];
            suffPro=suffPro*nums[n-i-1];

            maxPro=Math.max(maxPro,Math.max(prePro,suffPro));  
        }

        return maxPro;
    }
}