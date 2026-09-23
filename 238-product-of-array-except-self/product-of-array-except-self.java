class Solution {
    public int[] productExceptSelf(int[] nums) {

       int n=nums.length; 
       int prefixMul[]= new int[n];
       int suffixMul[]= new int[n];
       int ans[]= new int[n];


       for(int i=0,j=n-1;i<n && j>=0;++i,--j){
          if(i==0 ||j==n-1){
            prefixMul[i]=nums[i];
            suffixMul[j]=nums[j];
          }else{
            prefixMul[i]=prefixMul[i-1]*nums[i];
            suffixMul[j]=suffixMul[j+1]*nums[j];
          }
       }


       for(int i=0;i<n;++i){
          
          if(i==0)
          ans[i]=suffixMul[i+1];
          else if(i==n-1)
          ans[i]=prefixMul[i-1];
          else
          ans[i]=prefixMul[i-1]*suffixMul[i+1];
       }

       return ans;
    }
}