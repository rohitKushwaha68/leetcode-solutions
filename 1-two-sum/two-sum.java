class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        Map<Integer,Integer> map= new HashMap<>();

        for(int i=0;i<nums.length;++i){
             
             int element=target-nums[i];

             if(map.containsKey(element)){
                return new int[]{map.get(element),i};
             }else{
                map.put(nums[i],i);
             }
        }

        return new int[]{-1,-1};
    }
}