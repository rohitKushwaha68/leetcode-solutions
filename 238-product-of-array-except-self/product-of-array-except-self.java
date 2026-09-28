class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int preMax[] = new int[n];
        int suffMax[] = new int[n];
        int ans[] = new int[n];

        for (int i = 0; i < n; ++i) {
            if (i == 0) {
                preMax[i] = nums[i];
                suffMax[n-i-1] = nums[n-i-1];
            }else{
                preMax[i]=preMax[i-1]*nums[i];
                suffMax[n-i-1]=suffMax[n-i]*nums[n-i-1];
            }
        }

        for(int i=0;i<n;++i){
            
            if(i==0)
              ans[i]=suffMax[i+1];
            else if(i==n-1)
            ans[i]=preMax[i-1];
            else
            ans[i]=preMax[i-1]*suffMax[i+1];
        }

        return ans;
    }
}