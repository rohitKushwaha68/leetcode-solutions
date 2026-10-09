class Solution {
    public int longestConsecutive(int[] nums) {
        
        int n=nums.length;
         if(n==0)
         return 0;

        int longest=1;
        Set<Integer> set= new HashSet<>();
        for(int i=0;i<nums.length;++i){
             set.add(nums[i]);
        }

        for(int num: set){
            if(!set.contains(num-1)){
                 int count=1;
              while(set.contains(num+1)){
                   ++count;
                   longest=Math.max(count,longest);
                   ++num;
              }
            }
        }

        return longest;
    }
}