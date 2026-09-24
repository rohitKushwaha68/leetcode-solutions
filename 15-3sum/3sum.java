class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        List<List<Integer>> ans= new ArrayList<>();

        for(int i=0;i<=n-3;++i){
          int l=i+1;
          int h=n-1;

          while(l<h){
             if(nums[i]+nums[l]+nums[h]==0){
                 ans.add(Arrays.asList(nums[i], nums[l], nums[h]));
                while(l<h && nums[l]==nums[l+1]){
                      ++l;
                }
                ++l;

                while(l<h && nums[h-1]==nums[h]){
                      --h;
                }
                --h;
               
             }else if(nums[i]+nums[l]+nums[h]>0){
                --h;
             }else{
                ++l;
             }
          }

          while(i<n-3 && nums[i+1]==nums[i]){
            ++i;
          }

        }

        return ans;
    }
}