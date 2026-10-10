class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

     List<List<Integer>> ans= new ArrayList<>();
     Arrays.sort(nums);
      
      for(int i=0;i<=nums.length-3;++i){
       
       int low=i+1;
       int high=nums.length-1;

       while(low<high){
           
           if(nums[i]+nums[low]+nums[high]==0){
                ans.add(Arrays.asList(nums[i],nums[low],nums[high]));

                while(low<high && nums[low]==nums[low+1]){
                    ++low;
                }
                ++low;

                while(low<high && nums[high]==nums[high-1]){
                    --high;
                }
                --high;
                
           }else if(nums[i]+nums[low]+nums[high]>0){
            --high;
           }else{
            ++low;
           }
       }

       while(i<=nums.length-3 && nums[i]==nums[i+1]){
          ++i;
       }
      }
        return ans;   
    }
}